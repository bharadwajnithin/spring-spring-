package com.example.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@RequestMapping("/")
	public String display () {
		return ("<h1>welcome to this page</h1>");
	}

}
