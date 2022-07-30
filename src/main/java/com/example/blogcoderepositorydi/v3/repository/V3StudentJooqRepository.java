package com.example.blogcoderepositorydi.v3.repository;

import com.example.blogcoderepositorydi.entity.Student;

interface V3StudentJooqRepository {

	Student getByNameAndAge(String name, Integer age);
}
