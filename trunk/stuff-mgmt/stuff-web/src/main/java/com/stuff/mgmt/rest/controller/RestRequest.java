package com.stuff.mgmt.rest.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestRequest {

	@RequestMapping(value = "/")
	@ResponseBody
	public String index() {
		return "welcome !";
	}

	@RequestMapping(value = "test")
	@ResponseBody
	public String sayHello() throws IllegalAccessException {

		return "Hello world !";
	}

	@RequestMapping(value = "home")
	public String testWeb(ModelMap model) {
		model.put("welcomeStr", "welcome ! You ass hat.");
		return "welcome";
	}
	
	@RequestMapping(value="/run/test", method=RequestMethod.GET, produces="text/plain")
    @ResponseBody
    protected String runTest() throws IOException {
        return "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012";
    }
}
