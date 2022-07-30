package com.example.blogcoderepositorydi.v3.repository;

import com.example.blogcoderepositorydi.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
class V3StudentJooqRepositoryImpl implements V3StudentJooqRepository {

	@Override
	public Student getByNameAndAge(final String name, final Integer age) {
		return Student.of("학생 jooq", age, "강남구");
	}
}
