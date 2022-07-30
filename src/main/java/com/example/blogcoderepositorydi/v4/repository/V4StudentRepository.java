package com.example.blogcoderepositorydi.v4.repository;

import com.example.blogcoderepositorydi.entity.Student;
import org.springframework.data.repository.Repository;

/**
 * <pre>
 * v4
 *
 * - v3의 문제는 V3StudentQuerydslRepository, V3StudentJooqRepository를 중간에서 연결해주는 V3StudentRepository를 개발자가 직접 선언해야되는 것 입니다.
 *     - 추상 메서드가 선언되어있지 않은 가벼운 Repository를 Proxy 타겟으로 두어 생산성을 높일 수 있습니다.
 * - 하지만 Repository 인터페이스는 Spring의 기술입니다.
 */
public interface V4StudentRepository extends
		// NOTE: Generic 을 선언하지 않으면 오류가 발생합니다.
		// 이 오류로 JpaRepositoryFactory가 @Repository bean을 생성하는 과정을 추적할 수 있습니다.
		Repository<Student, Long>,
		V4StudentQuerydslRepository,
		V4StudentJooqRepository {

}
