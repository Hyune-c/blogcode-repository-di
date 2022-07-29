package com.example.blogcoderepositorydi.repository.v4;

import com.example.blogcoderepositorydi.entity.Student;

interface V4StudentJooqRepository {

	Student getByNameAndAge(String name, Integer age);
}
