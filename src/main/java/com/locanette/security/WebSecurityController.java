package com.locanette.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebSecurityController {

	@RequestMapping(value="/login")
	public String login() {
		return "/back/auth/login";
	}
	@RequestMapping(value="/admin")
	public String home() {
		return "/back/homes/main";
	}
	@RequestMapping(value="/403")
	public String accessDenied() {
		return "/back/errors/403";
	}
}
