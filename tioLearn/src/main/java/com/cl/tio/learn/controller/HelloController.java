package com.cl.tio.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cl.tio.learn.server.inter.TioService;

@RestController
public class HelloController {

	@Autowired
	TioService tioService;
	
	@RequestMapping("sayHai")
	public String sayHai() {
		return "hai, how are you!";
	}
	
	@RequestMapping("startTioServer")
	public String startTioServer() {
		tioService.startTioServer();
		return "SUCCESS";
	}
}
