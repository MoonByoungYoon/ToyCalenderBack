package com.toy.api.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toy.api.test.dto.TestDto;
import com.toy.api.test.service.TestService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class TestController {
	
	private final TestService testService; 
	
	@GetMapping("/")
	public String index() {
		return "index";
	}	

	@GetMapping("/public/testApi")
	public TestDto testApi() {
		TestDto returnDto = new TestDto();
		
		returnDto = testService.getTestApi();
		
		return returnDto;
	}
}
