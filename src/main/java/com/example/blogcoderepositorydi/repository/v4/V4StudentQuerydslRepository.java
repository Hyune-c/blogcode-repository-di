package com.example.blogcoderepositorydi.repository.v4;

import com.example.blogcoderepositorydi.entity.Student;

interface V4StudentQuerydslRepository {

	Student getByAgeAndAdress(Integer age, String adress);
}
