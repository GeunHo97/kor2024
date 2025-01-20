package pro.model.dto;

import jakarta.persistence.Entity;
import lombok.*;

import pro.model.entity.ProductCategoryEntity;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductCategoryDto {
    private Long categoryNo;
    private String categoryName;

    public ProductCategoryEntity PcEntity(){
        return ProductCategoryEntity.builder()
                .categoryNo(this.categoryNo).categoryName(this.categoryName)
                .build();
    }
}

