package com.learnbasicsapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learnbasicsapi.dto.Users;

@RestController
public class HomeController {

	@GetMapping("/welcomemsg")
	public String welcome() {
		return "Hello world";
	}

	@GetMapping("/mobiles")
	public String mobiles() {
		return "allmobiles";
	}

	@GetMapping("/add")
	public int add(@RequestParam(value = "firstvalue", required = false) int value1,
			@RequestParam("secondvalue") int value2) {
		return value1 + value2;
	}

//	Path Variable
	@GetMapping("/mul/{value1}/{value2}")
	public int mul(@PathVariable("value1") int operator1, @PathVariable("value2") int operator2) {
		return operator1 * operator2;
	}

//	
	@PostMapping("/Create an accout")
	public String saveUserData(@RequestBody Users users) {
		if (users.getUserName().equals("Lenin")) {
			return "Valid User";
		}
		return "Invalid information";
	}

}
