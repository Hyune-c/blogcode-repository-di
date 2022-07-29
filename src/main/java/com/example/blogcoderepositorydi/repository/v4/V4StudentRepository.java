package com.example.blogcoderepositorydi.repository.v4;

import com.example.blogcoderepositorydi.entity.Student;
import org.springframework.data.repository.Repository;

/**
 * <pre>
 * v4
 *
 * v3의 문제는 V3StudentQuerydslRepository, V3StudentJooqRepository를 중간에서 연결해주는 V3StudentRepository를 개발자가 직접 만들어야 하는것이라고 생각합니다.
 * 아무런 추상메서드가 선언되어있지 않은 Repository를 Proxy의 타겟으로 두어 개발자의 편의성을 높일 수 있다고 생각합니다.
 */
public interface V4StudentRepository extends
//		Repository, // NOTE: Generic 을 선언하지 않으면 오류가 발생합니다. 이 오류로 JpaRepositoryFactory가 @Repository빈을 생성하는 과정을 추적할 수 있습니다.
		Repository<Student, Long>,
		V4StudentQuerydslRepository,
		V4StudentJooqRepository {
}
