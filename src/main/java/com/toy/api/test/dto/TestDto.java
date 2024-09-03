package com.toy.api.test.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TestDto {
	
	public TestDto() {}

	int id;
	String name;

	@Builder
	public TestDto(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
