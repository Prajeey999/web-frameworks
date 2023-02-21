package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@ RestController
public class name{
	@GetMapping("/")
	public String show(@RequestParam String name) {
		return "Welcome "+name;
	}
}
