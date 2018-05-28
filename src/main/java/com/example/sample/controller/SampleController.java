package com.example.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello() {
		System.out.println("Called Hello");
        return "Hello Visitor!!!";
	}
	
	@RequestMapping(value = "/kill", method = RequestMethod.GET)
	public String kill() {
		System.out.println("inside kill method");
        System.exit(1);
		return "";
	}
}
