package com.example.blogcoderepositorydi.v1.repository;

import static org.assertj.core.api.Assertions.*;

import com.example.blogcoderepositorydi.entity.Student;
import com.example.blogcoderepositorydi.v1.repository.V1StudentRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class V1StudentRepositoryTest {

	@Autowired
	private V1StudentRepository v1StudentRepository;

	@BeforeEach
	public void beforeEach() {
		v1StudentRepository.save(Student.of("학생1", 20, "강남구"));
		v1StudentRepository.save(Student.of("학생2", 30, "서초구"));
		v1StudentRepository.save(Student.of("학생3", 40, "분당구"));
	}

	@AfterEach
	public void afterEach() {
		v1StudentRepository.deleteAll();
	}

	@Test
	void get() {
		assertThat(v1StudentRepository.getByName("학생1").getId()).isPositive();
		assertThat(v1StudentRepository.getByName("학생2").getId()).isPositive();
		assertThat(v1StudentRepository.getByName("학생3").getId()).isPositive();
		assertThat(v1StudentRepository.getByNameAndAge("학생10", 20).getName()).isEqualTo("학생 jooq");
		assertThat(v1StudentRepository.getByAgeAndAdress(20, "서초구").getName()).isEqualTo("학생 querydsl");
	}
}
