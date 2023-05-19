package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Jokes;

@RestController
public class JokesController {

	@RequestMapping("/postdata")
	public String postData(@RequestBody Jokes jokes) {
		System.out.println(jokes);
		return "Santosh";
	}
}
