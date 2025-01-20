package pro.model.entity;

import jakarta.persistence.*;
import lombok.*;
import pro.model.dto.OrderDetailDto;
import pro.model.dto.OrderDto;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_no", columnDefinition = "BIGINT AUTO_INCREMENT")
    private Long orderNo;     // 주문번호

    @Column(name = "member_no", columnDefinition = "BIGINT NOT NULL")
    private Long memberNo;    // 회원번호

    @Column(name = "order_date", columnDefinition = "DATETIME NOT NULL")
    private Date orderDate;   // 주문날짜

    @Column(name = "status", columnDefinition = "VARCHAR(20) NOT NULL")
    private String status;

    public OrderDto toODto(){
        return OrderDto.builder()
                .orderNo(this.orderNo).memberNo(this.memberNo).orderDate(this.orderDate).status(this.status)
                .build();
    }
}
