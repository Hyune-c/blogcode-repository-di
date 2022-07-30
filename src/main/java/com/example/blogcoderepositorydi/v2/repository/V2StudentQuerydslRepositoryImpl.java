package com.example.blogcoderepositorydi.v2.repository;

import com.example.blogcoderepositorydi.entity.Student;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class V2StudentQuerydslRepositoryImpl implements V2StudentQuerydslRepository {

	@Override
	public Student getByAgeAndAdress(final Integer age, final String adress) {
		return Student.of("학생 querydsl", age, "강남구");
	}
}
