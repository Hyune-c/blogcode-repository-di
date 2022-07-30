package com.example.blogcoderepositorydi.v5.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class V5StudentRepositoryTest {

	@Autowired
	private V5StudentRepository v5StudentRepository;

	@Test
	void get() {
		assertThat(v5StudentRepository.getByNameAndAge("학생10", 20).getName()).isEqualTo("학생 jooq");
		assertThat(v5StudentRepository.getByAgeAndAdress(20, "서초구").getName()).isEqualTo("학생 querydsl");
	}
}
