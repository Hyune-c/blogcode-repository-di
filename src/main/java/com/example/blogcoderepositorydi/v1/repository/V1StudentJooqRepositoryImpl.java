package com.example.blogcoderepositorydi.v1.repository;

import com.example.blogcoderepositorydi.entity.Student;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class V1StudentJooqRepositoryImpl implements V1StudentJooqRepository {

	@Override
	public Student getByNameAndAge(final String name, final Integer age) {
		return Student.of("학생 jooq", age, "강남구");
	}
}
