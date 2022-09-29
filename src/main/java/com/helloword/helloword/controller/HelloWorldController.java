package com.helloword.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/hello-word") //endpoin
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "hello world!";
	}
}
	
