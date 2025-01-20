package pro.model.dto;

import jakarta.persistence.Entity;
import lombok.*;
import pro.model.entity.OrderDetailEntity;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailDto {
    private Long orderDetailNo;  // 주문상세번호
    private Long orderNo;        // 주문번호
    private Long productNo;      // 상품번호
    private int quantity;        // 수량
    private double price;        // 가격

    public OrderDetailEntity OrderDetailEntity(){
        return OrderDetailEntity.builder()
                .orderDetailNo(this.orderDetailNo).orderNo(this.orderNo).productNo(this.productNo).quantity(this.quantity).price(this.price)
                .build();
    }



}
