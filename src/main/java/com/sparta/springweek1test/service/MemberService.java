package com.sparta.springweek1test.service;

import com.sparta.springweek1test.dto.MemberResponseDto;
import com.sparta.springweek1test.entity.Member;
import com.sparta.springweek1test.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    //Member 한 명 조회
    public MemberResponseDto findMember(Long id){
        Member member = memberRepository.findById(id).orElseThrow(()-> new NullPointerException("회원 상세 조회 실패"));
        MemberResponseDto memberResponseDto = new MemberResponseDto(member);
        return memberResponseDto;
        }


    // 전체 조회
    public List<MemberResponseDto> findAllMember() {
        return memberRepository.findAll().stream().map(MemberResponseDto::new).toList();
    }

}