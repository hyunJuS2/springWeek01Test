package com.sparta.springweek1test;

import com.sparta.springweek1test.entity.Member;
import com.sparta.springweek1test.repository.MemberRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class MemberTest {
    @PersistenceContext
    EntityManager em;

    @Autowired
    MemberRepository memberRepository;

    @Test
    @Transactional
    @Rollback(value = false) // 테스트 코드에서 @Transactional 를 사용하면 테스트가 완료된 후 롤백하기 때문에 false 옵션 추가
    @DisplayName("멤버 생성 성공")
    void test1() {
        Member member = new Member();
        member.setName("wooah");
        member.setPw("1555");
        member.setEmail("wooah@naver.com");

        em.persist(member);  // 영속성 컨텍스트에 메모 Entity 객체를 저장합니다.

    }
}
