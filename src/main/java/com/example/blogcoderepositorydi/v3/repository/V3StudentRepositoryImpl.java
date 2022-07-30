package com.example.blogcoderepositorydi.v3.repository;

import com.example.blogcoderepositorydi.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class V3StudentRepositoryImpl implements V3StudentRepository {

	private final V3StudentJooqRepository v3StudentJooqRepository;
	private final V3StudentQuerydslRepository v3StudentQuerydslRepository;

	@Override
	public Student getByNameAndAge(final String name, final Integer age) {
		return v3StudentJooqRepository.getByNameAndAge(name, age);
	}

	@Override
	public Student getByAgeAndAdress(final Integer age, final String adress) {
		return v3StudentQuerydslRepository.getByAgeAndAdress(age, adress);
	}
}
