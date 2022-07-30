package com.example.blogcoderepositorydi.v3.repository;

import com.example.blogcoderepositorydi.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
class V3StudentQuerydslRepositoryImpl implements V3StudentQuerydslRepository {

	@Override
	public Student getByAgeAndAdress(final Integer age, final String adress) {
		return Student.of("학생 querydsl", age, "강남구");
	}
}
