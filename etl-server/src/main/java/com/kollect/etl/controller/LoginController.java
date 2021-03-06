package com.kollect.etl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	/**
	 * GET request to map the login request to the login form
	 * @return
	 */

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	/**
	 * GET request to map the 403 error page to the 403 html used when a user accesses a page they don't have rights to
	 * @return
	 */

	@RequestMapping("/403")
	public String Error403() {
		return "403";
	}
	
}