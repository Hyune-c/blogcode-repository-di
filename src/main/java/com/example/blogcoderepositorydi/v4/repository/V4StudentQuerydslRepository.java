package com.example.blogcoderepositorydi.v4.repository;

import com.example.blogcoderepositorydi.entity.Student;

interface V4StudentQuerydslRepository {

	Student getByAgeAndAdress(Integer age, String adress);
}
