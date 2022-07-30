package com.example.blogcoderepositorydi.v2.repository;

import org.springframework.stereotype.Repository;

/**
 * <pre>
 * v2
 *
 * v1과 다르게 어떤 도메인은 복잡한 조회 쿼리만 필요한 경우가 있습니다.
 * - 이 때는 Jooq와 Querydsl만 활용하고 싶습니다.
 * - JpaRepository를 활용하면 사용되지 않는 CRUD 메서드가 다수 생성되기 때문입니다.
 *
 *
 * - JpaRepository를 extends 하지 않습니다.
 *     - proxy가 생성되지 않아 bean DI가 되지 않습니다.
 *     - 테스트 코드 실행으로 시연할 수 있습니다.
 *
 * Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.example.blogcoderepositorydi.v2.repository.V2StudentRepository' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
 * </pre>
 */
@Repository
public interface V2StudentRepository extends
		V2StudentQuerydslRepository,
		V2StudentJooqRepository {

}
