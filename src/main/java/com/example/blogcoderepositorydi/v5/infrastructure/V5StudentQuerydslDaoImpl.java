package com.example.blogcoderepositorydi.v5.infrastructure;

import com.example.blogcoderepositorydi.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
class V5StudentQuerydslDaoImpl implements V5StudentQuerydslDao {

	@Override
	public Student getByAgeAndAdress(final Integer age, final String adress) {
		return Student.of("학생 querydsl", age, "강남구");
	}
}
