package com.stuff.mgmt.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.stuff.mgmt.rest.config.aop.ControllerAOP;

@Configuration
@EnableWebMvc
@ComponentScan("com.stuff.mgmt.rest.controller")
@EnableAspectJAutoProxy
public class WebAppConfig extends WebMvcConfigurationSupport {

	@Bean
	public ControllerAOP controllerAOP() {
		return new ControllerAOP();
	}

	@Bean
	public ViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}
}
