package com.toy.api.test.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TestDto {

	public TestDto() {
	}

	int id;
	int type;
	String name;
	String user;

	@Builder
	public TestDto(int id, int type, String name, String user) {
		this.id = id;
		this.type = type;
		this.name = name;
		this.user = user;
	}
}
