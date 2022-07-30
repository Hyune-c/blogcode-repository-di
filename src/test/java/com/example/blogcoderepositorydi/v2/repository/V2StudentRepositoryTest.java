package com.example.blogcoderepositorydi.v2.repository;

import static org.assertj.core.api.Assertions.*;

import com.example.blogcoderepositorydi.v2.repository.V2StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class V2StudentRepositoryTest {

	@Autowired
	private V2StudentRepository v2StudentRepository;

	@Test
	void get() {
		assertThat(v2StudentRepository.getByNameAndAge("학생10", 20).getName()).isEqualTo("학생 jooq");
		assertThat(v2StudentRepository.getByAgeAndAdress(20, "서초구").getName()).isEqualTo("학생 querydsl");
	}
}
