package pro.model.dto;

import jakarta.persistence.Entity;
import lombok.*;
import pro.model.entity.OrderDetailEntity;
import pro.model.entity.OrderEntity;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private Long orderNo;
    private Long memberNo;
    private Date orderDate;
    private String status;

    public OrderEntity toOntity(){
        return OrderEntity.builder()
                .orderNo(this.orderNo).memberNo(this.memberNo).orderDate(this.orderDate).status(this.status)
                .build();
    }
}
