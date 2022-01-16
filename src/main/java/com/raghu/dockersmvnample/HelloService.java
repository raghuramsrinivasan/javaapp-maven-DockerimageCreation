package com.raghu.dockersmvnample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

	@GetMapping("/hello")
	public String hello() {
		return "Hello Welcome to tutorial !";
	}
	
}
