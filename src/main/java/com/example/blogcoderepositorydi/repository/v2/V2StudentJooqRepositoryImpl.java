package com.example.blogcoderepositorydi.repository.v2;

import com.example.blogcoderepositorydi.entity.Student;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class V2StudentJooqRepositoryImpl implements V2StudentJooqRepository {

	@Override
	public Student getByNameAndAge(final String name, final Integer age) {
		return Student.of("학생 jooq", age, "강남구");
	}
}
