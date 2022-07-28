package com.example.blogcoderepositorydi.repository.v2;

import com.example.blogcoderepositorydi.entity.Student;

interface V2StudentJooqRepository {

	Student getByNameAndAge(String name, Integer age);
}
