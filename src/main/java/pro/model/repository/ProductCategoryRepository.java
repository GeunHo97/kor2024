package pro.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pro.model.entity.ProductCategoryEntity;

public interface ProductCategoryRepository extends JpaRepository<ProductCategoryEntity,Integer> {
}
