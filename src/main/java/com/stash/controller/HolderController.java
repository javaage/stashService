package com.stash.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stash.service.AllStockService;



@Controller
@RestController
@RequestMapping(value="/holder")
public class HolderController {
	@Autowired
	private AllStockService allStockService;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getAccountList(HttpServletRequest request,HttpServletResponse response){
		Map<String, Object> code = new HashMap<String, Object>();
		code.put("code", 1);
		
		code.put("users", allStockService.getAllStock());
		return code;
		
		//return allStockService.getAllStock();
	}
}
