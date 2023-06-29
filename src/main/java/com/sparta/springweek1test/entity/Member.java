package com.sparta.springweek1test.entity;

//import com.sparta.springweek1test.dto.MemberRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "members")
public class Member {
    // 아이디(식별자), 이름, 비밀번호, 이메일 -> 회원정보
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "pw", nullable = false)
    private String pw;

}
