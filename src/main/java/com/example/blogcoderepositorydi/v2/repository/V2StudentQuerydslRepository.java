package com.example.blogcoderepositorydi.v2.repository;

import com.example.blogcoderepositorydi.entity.Student;

interface V2StudentQuerydslRepository {

	Student getByAgeAndAdress(Integer age, String adress);
}
