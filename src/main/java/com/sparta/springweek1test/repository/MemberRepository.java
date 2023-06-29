package com.sparta.springweek1test.repository;

import com.sparta.springweek1test.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member , Long> {
}
