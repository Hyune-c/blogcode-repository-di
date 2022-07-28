package com.example.blogcoderepositorydi.repository.v1;

import com.example.blogcoderepositorydi.entity.Student;

interface V1StudentQuerydslRepository {

	Student getByAgeAndAdress(Integer age, String adress);
}
