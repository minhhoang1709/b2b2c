package b2b2c.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import b2b2c.model.OrderModel;

@Repository
public interface OrderRepository extends JpaRepository<OrderModel, Integer>{
	OrderModel findByOrderUserId(int orderUserId);
	
	@Query(value="SELECT COUNT(*) FROM tblorder WHERE order_user_id=:order_user_id AND order_status=true", nativeQuery = true)
	int findInactiveOrder(@Param("order_user_id") int order_user_id);
}
