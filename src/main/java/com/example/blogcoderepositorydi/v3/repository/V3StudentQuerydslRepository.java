package com.example.blogcoderepositorydi.v3.repository;

import com.example.blogcoderepositorydi.entity.Student;

interface V3StudentQuerydslRepository {

	Student getByAgeAndAdress(Integer age, String adress);
}
