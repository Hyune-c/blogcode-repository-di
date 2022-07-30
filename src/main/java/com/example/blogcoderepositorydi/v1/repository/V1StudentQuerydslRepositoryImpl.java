package com.example.blogcoderepositorydi.v1.repository;

import com.example.blogcoderepositorydi.entity.Student;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class V1StudentQuerydslRepositoryImpl implements V1StudentQuerydslRepository {

	@Override
	public Student getByAgeAndAdress(final Integer age, final String adress) {
		return Student.of("학생 querydsl", age, "강남구");
	}
}
