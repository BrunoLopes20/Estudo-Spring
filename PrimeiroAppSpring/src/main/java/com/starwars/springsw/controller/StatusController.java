package com.starwars.springsw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

	@GetMapping("/api/status")
	public String check(){
		System.out.println("Online");
		return "Online";
	}

}
