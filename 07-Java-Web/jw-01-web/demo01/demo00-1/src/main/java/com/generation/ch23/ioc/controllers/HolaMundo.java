package com.generation.ch23.ioc.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HolaMundo {
	@RequestMapping("/")
	public String hola() {
		return "Hola SpringBoot";
	}
}
