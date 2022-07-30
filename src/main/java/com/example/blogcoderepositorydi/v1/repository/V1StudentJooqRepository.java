package com.example.blogcoderepositorydi.v1.repository;

import com.example.blogcoderepositorydi.entity.Student;

interface V1StudentJooqRepository {

	Student getByNameAndAge(String name, Integer age);
}
