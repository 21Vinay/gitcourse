package com.nagarro.codecoveragedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/home")
	public String getHome() {
		
		return "Welcome to the Homepage";
	}

	@RequestMapping(value = "/msg/{message}" , method = RequestMethod.POST)
	public String getMessage(@PathVariable String message) {
		
		StringBuilder msg = new StringBuilder();
		if(message == null || message.trim().length() == 0) {
			msg = msg.append("Please provide a name !");		
		}
		else {
			msg.append("Hello " + message + "!");
		}
		
		return msg.toString();
		
	}
	
}