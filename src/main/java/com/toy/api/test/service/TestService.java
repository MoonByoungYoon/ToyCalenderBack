package com.toy.api.test.service;

import org.springframework.stereotype.Service;

import com.toy.api.test.dto.TestDto;
import com.toy.api.test.mapper.TestMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TestService {
	
	private final TestMapper testMapper;

	public TestDto getTestApi() {
		TestDto resDto = testMapper.selectApi();
    return resDto;
	}
}
