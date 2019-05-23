package b2b2c.repository;

import java.util.ArrayList;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import b2b2c.model.CartModel;


@Repository
public interface CartRepository extends JpaRepository<CartModel, Integer> {
	
	CartModel getByCartPaintIdAndCartOrderId(int cartPaintId, int cartOrderId);
	
	ArrayList<CartModel> getCartByCartOrderId(int cartOrderId);
	
	@Query(value="SELECT COUNT(*) FROM tblcart WHERE cart_order_id=:cart_order_id", nativeQuery = true)
	CartModel countByCartOrderId(@Param("cart_order_id") int cartOrderId);
	
//	@Query(value="DELETE FROM tblcart WHERE cart_order_id=:cart_order_id", nativeQuery = true)
//	void deleteByOrderId(@Param("cart_order_id") int cartOrderId);
	
	 @Modifying
	 @Transactional
	 void deleteByCartOrderId(int cartOrderId);
	 
	 @Modifying
	 @Transactional
	 void deleteByCartItemId(int cartItemId);
}
