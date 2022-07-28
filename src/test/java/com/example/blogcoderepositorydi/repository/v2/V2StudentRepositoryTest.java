package com.example.blogcoderepositorydi.repository.v2;

import static org.assertj.core.api.Assertions.*;

import com.example.blogcoderepositorydi.entity.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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
