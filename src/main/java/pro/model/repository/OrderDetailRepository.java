package pro.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.model.entity.OrderDetailEntity;



public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity,Integer> {
}
