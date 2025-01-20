package pro.model.entity;

import jakarta.persistence.*;
import lombok.*;
import pro.model.dto.ProductDto;

@Entity
@Getter@Setter@ToString@Builder
@NoArgsConstructor@AllArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_no", columnDefinition = "BIGINT AUTO_INCREMENT")
    private Long productNo;   // 상품번호

    @Column(name = "category_no", columnDefinition = "BIGINT NOT NULL")
    private Long categoryNo;  // 카테고리번호

    @Column(name = "product_name", columnDefinition = "VARCHAR(100) NOT NULL")
    private String productName;  // 상품명

    @Column(name = "price", columnDefinition = "DECIMAL(10,2) NOT NULL")
    private double price;        // 가격

    @Column(name = "stock_quantity", columnDefinition = "INT NOT NULL")
    private int stockQuantity;

    public ProductDto PDto(){
        return ProductDto.builder()
                .productNo(this.productNo).categoryNo(this.categoryNo).productName(this.productName).price(this.price).stockQuantity(this.stockQuantity)
                .build();
    }

    @ToString.Exclude @ManyToOne // FK
    @JoinColumn( name = "categoryNo") // FK 필드명
    private ProductCategoryEntity productCategoryEntity;

}
