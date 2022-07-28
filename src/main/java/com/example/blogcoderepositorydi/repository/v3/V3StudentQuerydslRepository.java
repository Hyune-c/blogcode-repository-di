package com.example.blogcoderepositorydi.repository.v3;

import com.example.blogcoderepositorydi.entity.Student;
import org.springframework.stereotype.Repository;

interface V3StudentQuerydslRepository {

	Student getByAgeAndAdress(Integer age, String adress);
}
