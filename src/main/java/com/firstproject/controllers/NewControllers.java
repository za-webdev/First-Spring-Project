package com.firstproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class NewControllers {
	@RequestMapping("")
	public String index() {
		return "hello.jsp";
	}
	
	
}

