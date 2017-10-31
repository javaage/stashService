package com.stash;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

import com.stash.Application.Env;

@Service
public class TokenValidationFilter extends OncePerRequestFilter {
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		Application.logger.debug("check token");
		
		Application.logger.debug(request.getRequestURL().toString());
		Application.logger.debug("requestUri" + request.getRequestURI());
		Application.logger.debug(request.getQueryString());
		
		Application.logger.debug(request.getContextPath());
		
		if(request.getRequestURI().equals("/account/all") || 
				request.getRequestURI().equals("/booking/all") ||
				request.getRequestURI().equals("/account/import") ||
				request.getRequestURI().equals("/booking/all")){
			filterChain.doFilter(request, response);
			return;
		}
		else if (Application.envCurrent == Env.local) {
			request.setAttribute("userName", "AdminTianjin");//502673373 //SuperAdmin//AdminTianjin
			filterChain.doFilter(request, response);
			return;
		} 
		else {
			request.setAttribute("userName", "AdminTianjin");//502673373 //SuperAdmin//AdminTianjin
			filterChain.doFilter(request, response);
			return;
		}
		
	}

}
