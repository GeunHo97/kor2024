package pro.model.dto;

import jakarta.persistence.Entity;
import lombok.*;
import pro.model.entity.ProductEntity;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long productNo;   // 상품번호
    private Long categoryNo;  // 카테고리번호
    private String productName;
    private double price;
    private int stockQuantity;

    public ProductEntity PEntity(){
        return ProductEntity.builder()
                .productNo(this.productNo).categoryNo(this.categoryNo).productName(this.productName).price(this.price).stockQuantity(this.stockQuantity)
                .build();
    }
}
