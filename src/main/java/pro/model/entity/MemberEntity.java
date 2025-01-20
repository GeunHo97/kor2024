package pro.model.entity;

import jakarta.persistence.*;
import lombok.*;
import pro.model.dto.MemberDto;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_no", columnDefinition = "BIGINT AUTO_INCREMENT")
    private Long memberNo;  // 회원번호

    @Column(name = "username", columnDefinition = "VARCHAR(50) NOT NULL")
    private String username;  // 아이디

    @Column(name = "password", columnDefinition = "VARCHAR(100) NOT NULL")
    private String password;  // 패스워드

    @Column(name = "name", columnDefinition = "VARCHAR(100) NOT NULL")
    private String name;      // 이름

    @Column(name = "phone", columnDefinition = "VARCHAR(20)")
    private String phone;     // 전화번호

    @Column(name = "email", columnDefinition = "VARCHAR(100)")
    private String email;    // 이메일

    public MemberDto toMDto(){
        return MemberDto.builder()
                .memberNo(this.memberNo).username(this.username).password(this.password).name(this.name).phone(this.phone).email(this.email)
                .build();
    }
}
