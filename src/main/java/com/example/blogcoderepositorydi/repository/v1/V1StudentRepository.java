package com.example.blogcoderepositorydi.repository.v1;

import com.example.blogcoderepositorydi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <pre>
 * v1
 *
 * 실무에서 주로 사용하는 방법입니다.
 * - 쉬운 기능은 JpaRepository를 통해 생성되는 메서드를 활용합니다.
 *     - 이름으로 조회하는 경우 JpaRepository를 활용합니다.
 * - 일부 복잡한 쿼리는 Jooq or Querydsl을 활용합니다.
 *     - 이름과 나이로 조회하는 경우 Jooq를 활용합니다.
 *     - 나이와 주소로 조회하는 경우 Querydsl을 활용합니다.
 *
 *
 * - JpaRepository를 extends 합니다.
 *     - SimpleJpaRepository를 target으로 하는 proxy가 생성됩니다.
 *     - 즉 bean DI에 문제가 없어 정상 작동 합니다.
 * </pre>
 */
@Repository
public interface V1StudentRepository extends
		JpaRepository<Student, Long>,
		V1StudentQuerydslRepository,
		V1StudentJooqRepository {

	Student getByName(final String name);
}
