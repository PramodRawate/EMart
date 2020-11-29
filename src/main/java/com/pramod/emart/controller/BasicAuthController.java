package com.pramod.emart.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pramod.emart.Bean.AuthenticationBean;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class BasicAuthController {

	private final String template  = "Hello %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping(path="/basicauth")
	public AuthenticationBean basicauth() {
		return new AuthenticationBean("Welcome Pramod");
	}
	
	@RequestMapping("/greeting")
	public Greetings greeting(@RequestParam(value="name", defaultValue="Pramod") String name) {
		return new Greetings(counter.incrementAndGet(), String.format(template, name));
	}
}


