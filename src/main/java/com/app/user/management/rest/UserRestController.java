package com.app.user.management.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/rest")
public class UserRestController {

	@GetMapping("/welcome")
	public String hello() {
		return "Hello";
	}
}
