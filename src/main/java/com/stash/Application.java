package com.stash;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.stash")
@EnableCaching
@EnableTransactionManagement
//@EnableOAuth2Sso
//@EnableOAuth2Client
@SpringBootApplication
public class Application  {
	
	public final static Logger logger = LoggerFactory.getLogger(Application.class);
	
	public enum Env {
		local, gehc, beta, alpha, bj, diliu, test, security
	};

	public static Env envCurrent = Env.local;
	public static String urlUAA = "";
	public static String authorization = "";
	
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(Application.class);
		ApplicationContext ctx = springApplication.run(args);
	}
}
