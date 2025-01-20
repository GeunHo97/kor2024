package pro.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.model.entity.CartEntity;

public interface CartRepository extends JpaRepository<CartEntity,Integer> {
}
