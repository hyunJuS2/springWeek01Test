package com.sparta.springweek1test.dto;

import com.sparta.springweek1test.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberResponseDto {

    private Long id;
    private String name;
    private String email;
    private String pw;

    public MemberResponseDto(Member member) {
       this.id = member.getId();
       this.email = member.getEmail();
       this.pw = member.getPw();
       this.name = member.getName();
    }
}
