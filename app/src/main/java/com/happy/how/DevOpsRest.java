package com.happy.how;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevOpsRest {

	@RequestMapping("/")
	public String helloWorld() {
		return "Hello World";
	}
}
