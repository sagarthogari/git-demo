package com.github.commonds.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("/test")
	public String getMessage() {
		return "Hello";
	}
	


}
