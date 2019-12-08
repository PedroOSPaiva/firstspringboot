package com.ph.firstspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstSpringBootController {
		
	@RequestMapping("/showtext")
	public String showTxt() {
		return "Hello, First Spring Projetc";
	}
	
}
