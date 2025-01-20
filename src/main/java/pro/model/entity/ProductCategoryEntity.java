package pro.model.entity;


import jakarta.persistence.*;
import lombok.*;

import pro.model.dto.ProductCategoryDto;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_no", columnDefinition = "BIGINT AUTO_INCREMENT")
    private Long categoryNo;     // 제품카테고리번호

    @Column(name = "category_name", columnDefinition = "VARCHAR(100) NOT NULL")
    private String categoryName;  // 카테고리이름

    public ProductCategoryDto PcDto(){
        return ProductCategoryDto.builder()
                .categoryNo(this.categoryNo).categoryName(this.categoryName)
                .build();
    }
    @OneToMany( mappedBy = "productCategoryEntity" , cascade = CascadeType.ALL)
    @ToString.Exclude @Builder.Default // 빌더패턴 사용시 초기값 설정
    List<ProductEntity> productEntityList = new ArrayList<>();


}
