package com.example.blogcoderepositorydi.repository.v3;

import com.example.blogcoderepositorydi.entity.Student;

/**
 * <pre>
 * v3
 *
 * v2의 문제를 해결하기 위해 V3StudentRepositoryImpl을 구현했습니다.
 * - Jooq와 Querydsl를 구현체로 활용하기 위해 사용하는 메서드 시그니처를 선언합니다.
 * - Impl에서는 각 기능에 맞는 구현체를 연결합니다.
 * - DI를 위해 각 구현체를 bean 등록합니다.
 */
public interface V3StudentRepository {

	Student getByNameAndAge(String name, Integer age);

	Student getByAgeAndAdress(Integer age, String adress);
}
