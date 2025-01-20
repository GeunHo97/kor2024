package pro.model.dto;

import jakarta.persistence.Entity;
import lombok.*;
import pro.model.entity.MemberEntity;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private Long memberNo;
    private String username;
    private String password;
    private String name;
    private String phone;
    private String email;



    public MemberEntity toMEntity(){
        return MemberEntity.builder()
                .memberNo(this.memberNo).username(this.username).password(this.password).name(this.name).phone(this.phone).email(this.email)
                .build();
    }

}
