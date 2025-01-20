package pro.model.entity;

import jakarta.persistence.*;
import lombok.*;

import pro.model.dto.OrderDetailDto;


@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_no", columnDefinition = "BIGINT AUTO_INCREMENT")
    private Long orderDetailNo;  // 주문상세번호

    @Column(name = "order_no", columnDefinition = "BIGINT NOT NULL")
    private Long orderNo;        // 주문번호

    @Column(name = "product_no", columnDefinition = "BIGINT NOT NULL")
    private Long productNo;      // 상품번호

    @Column(name = "quantity", columnDefinition = "INT NOT NULL")
    private int quantity;        // 수량

    @Column(name = "price", columnDefinition = "DECIMAL(10, 2) NOT NULL")
    private double price;        // 가격

    public OrderDetailDto OrderDetailDto(){
        return OrderDetailDto.builder()
                .orderDetailNo(this.orderDetailNo).orderNo(this.orderNo).productNo(this.productNo).quantity(this.quantity).price(this.price)
                .build();
    }
}
