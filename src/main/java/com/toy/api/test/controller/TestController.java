package com.toy.api.test.controller;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;

import com.toy.api.test.dto.TestDto;
import com.toy.api.test.service.TestService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
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
		System.out.println("returnDto.id : " + returnDto.getId());
		System.out.println("returnDto.name : " + returnDto.getName());
		
		return returnDto;
	}
}
