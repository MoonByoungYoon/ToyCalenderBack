package com.toy.api.test.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.toy.api.test.dto.TestDto;

@Mapper
public interface TestMapper {
	TestDto selectApi();
}
