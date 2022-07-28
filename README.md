# Repository 의존성을 가볍게 관리하기

> 이 내용은 정리 후 블로그로 이동됩니다.

## v1

실무에서 주로 사용하는 방법입니다.

- `V1StudentRepository` javadoc 참조

## v2

v1과 다르게 어떤 도메인은 복잡한 조회 쿼리만 필요한 경우가 있습니다.

- `V2StudentRepository` javadoc 참조

## v3

v2의 문제를 해결하기 위해 V3StudentRepositoryImpl을 구현했습니다.

- `V3StudentRepository` javadoc 참조
- `delegate` 패턴과 유사합니다.
- dao vs repository를 구분할 필요가 있을 수도 있습니다.
    - https://www.baeldung.com/java-dao-vs-repository
    - 하지만 최신에는 dao라는 표현이 너무 올드합니다.
    - 재해석하여 네이밍 할 수 있는 영역입니다.
        - 모듈화를 통해 캡슐화 가능하기 때문입니다.

## 참고 자료

- https://studio108.tistory.com/25
- https://pingpongdev.tistory.com/25
