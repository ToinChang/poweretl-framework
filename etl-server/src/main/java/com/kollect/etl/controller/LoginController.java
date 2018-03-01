package com.kollect.etl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/403")
	public String Error403() {
		return "403";
	}
	
}