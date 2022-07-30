package com.example.blogcoderepositorydi.v5.infrastructure;

import com.example.blogcoderepositorydi.entity.Student;

interface V5StudentQuerydslDao {

	Student getByAgeAndAdress(Integer age, String adress);
}
