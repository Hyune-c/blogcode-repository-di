package com.example.blogcoderepositorydi.v1.repository;

import com.example.blogcoderepositorydi.entity.Student;

interface V1StudentQuerydslRepository {

	Student getByAgeAndAdress(Integer age, String adress);
}
