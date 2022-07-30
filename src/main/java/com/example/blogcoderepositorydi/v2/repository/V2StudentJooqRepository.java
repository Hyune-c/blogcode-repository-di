package com.example.blogcoderepositorydi.v2.repository;

import com.example.blogcoderepositorydi.entity.Student;

interface V2StudentJooqRepository {

	Student getByNameAndAge(String name, Integer age);
}
