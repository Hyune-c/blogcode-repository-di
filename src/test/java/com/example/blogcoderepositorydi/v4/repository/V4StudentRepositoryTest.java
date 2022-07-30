package com.example.blogcoderepositorydi.v4.repository;

import static org.assertj.core.api.Assertions.*;

import com.example.blogcoderepositorydi.v4.repository.V4StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class V4StudentRepositoryTest {

	@Autowired
	private V4StudentRepository v4StudentRepository;

	@Test
	void get() {
		assertThat(v4StudentRepository.getByNameAndAge("학생10", 20).getName()).isEqualTo("학생 jooq");
		assertThat(v4StudentRepository.getByAgeAndAdress(20, "서초구").getName()).isEqualTo("학생 querydsl");
	}
}
