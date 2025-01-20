package pro.model.dto;

import jakarta.persistence.Entity;
import lombok.*;
import pro.model.entity.CartEntity;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {
    private Long cartNo;
    private Long productNo;
    private String username;




    public CartEntity toCEntity(){
        return CartEntity.builder()
                .cartNo(this.cartNo).productNo(this.productNo).username(this.username)
                .build();
    }
}
