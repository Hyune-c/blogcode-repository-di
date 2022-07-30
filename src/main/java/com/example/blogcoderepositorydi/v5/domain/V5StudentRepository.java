package com.example.blogcoderepositorydi.v5.domain;

import com.example.blogcoderepositorydi.entity.Student;

/**
 * <pre>
 * v5
 *
 * DDD 에서 권장하는 구조입니다.
 * - 인터페이스인 Repository는 domain 레이어에 위치합니다.
 *     - Spring 의존성이 제거됩니다.
 * - 구현체는 infrastructure 레이어에 위치합니다.
 *     - 패키지가 분리되어 접근 제한자를 public으로 변경해야 됩니다.
 */
public interface V5StudentRepository {

	Student getByNameAndAge(String name, Integer age);

	Student getByAgeAndAdress(Integer age, String adress);
}
