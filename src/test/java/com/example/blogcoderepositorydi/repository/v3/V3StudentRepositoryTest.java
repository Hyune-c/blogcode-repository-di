package com.example.blogcoderepositorydi.repository.v3;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class V3StudentRepositoryTest {

	@Autowired
	private V3StudentRepository v3StudentRepository;

	@Test
	void get() {
		assertThat(v3StudentRepository.getByNameAndAge("학생10", 20).getName()).isEqualTo("학생 jooq");
		assertThat(v3StudentRepository.getByAgeAndAdress(20, "서초구").getName()).isEqualTo("학생 querydsl");
	}
}
