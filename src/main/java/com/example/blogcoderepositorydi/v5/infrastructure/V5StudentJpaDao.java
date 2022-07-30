package com.example.blogcoderepositorydi.v5.infrastructure;

import com.example.blogcoderepositorydi.entity.Student;
import com.example.blogcoderepositorydi.v5.domain.V5StudentRepository;
import org.springframework.data.repository.Repository;

public interface V5StudentJpaDao extends
		V5StudentRepository,
		Repository<Student, Long>,
		V5StudentJooqDao,
		V5StudentQuerydslDao {

}
