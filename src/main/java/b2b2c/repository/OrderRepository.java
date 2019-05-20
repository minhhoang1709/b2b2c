package b2b2c.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import b2b2c.model.OrderModel;

@Repository
public interface OrderRepository extends JpaRepository<OrderModel, Integer>{

}
