package com.example.blogcoderepositorydi.v4.repository;

import com.example.blogcoderepositorydi.entity.Student;

interface V4StudentJooqRepository {

	Student getByNameAndAge(String name, Integer age);
}
