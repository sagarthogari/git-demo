package com.github.commonds.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("/test")
	public String getMessage() {
		return "Hello";
	}
	@GetMapping("/test2")
	public String getMessage@() {
		return "Hello welocme";
	}
@GetMapping("/test3")
	public String getMessage3() {
		return "Hello welocme java";
	}

}
