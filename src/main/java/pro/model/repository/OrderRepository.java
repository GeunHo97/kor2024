package pro.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.model.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {
}
