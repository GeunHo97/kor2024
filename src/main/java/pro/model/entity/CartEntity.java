package pro.model.entity;

import jakarta.persistence.*;
import lombok.*;
import pro.model.dto.CartDto;


@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_no", columnDefinition = "BIGINT AUTO_INCREMENT")
    private Long cartNo;      // 장바구니번호

    @Column(name = "product_no", columnDefinition = "BIGINT NOT NULL")
    private Long productNo;   // 상품번호

    @Column(name = "username", columnDefinition = "VARCHAR(50) NOT NULL")
    private String username;  // 아이디

    public CartDto toCDto(){
        return CartDto.builder()
                .cartNo(this.cartNo).productNo(this.productNo).username(this.username).build();
    }
}
