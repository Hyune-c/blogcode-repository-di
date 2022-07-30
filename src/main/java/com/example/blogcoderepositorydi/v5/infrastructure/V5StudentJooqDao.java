package com.example.blogcoderepositorydi.v5.infrastructure;

import com.example.blogcoderepositorydi.entity.Student;

interface V5StudentJooqDao {

	Student getByNameAndAge(String name, Integer age);
}
