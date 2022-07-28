package com.example.blogcoderepositorydi.repository.v2;

import com.example.blogcoderepositorydi.entity.Student;

interface V2StudentQuerydslRepository {

	Student getByAgeAndAdress(Integer age, String adress);
}
