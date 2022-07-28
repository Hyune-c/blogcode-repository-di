package com.example.blogcoderepositorydi.repository.v1;

import com.example.blogcoderepositorydi.entity.Student;

interface V1StudentJooqRepository {

	Student getByNameAndAge(String name, Integer age);
}
