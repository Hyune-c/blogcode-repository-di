package com.example.blogcoderepositorydi.repository.v3;

import com.example.blogcoderepositorydi.entity.Student;
import org.springframework.stereotype.Repository;

interface V3StudentJooqRepository {

	Student getByNameAndAge(String name, Integer age);
}
