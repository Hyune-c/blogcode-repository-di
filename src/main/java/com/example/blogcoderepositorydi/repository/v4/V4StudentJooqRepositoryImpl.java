package com.example.blogcoderepositorydi.repository.v4;

import com.example.blogcoderepositorydi.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
class V4StudentJooqRepositoryImpl implements V4StudentJooqRepository {

	@Override
	public Student getByNameAndAge(final String name, final Integer age) {
		return Student.of("학생 jooq", age, "강남구");
	}
}
