package com.cl.tio.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("sayHai")
	public String sayHai() {
		return "hai, how are you!";
	}
}
