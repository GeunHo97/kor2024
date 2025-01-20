package pro.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.model.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
}
