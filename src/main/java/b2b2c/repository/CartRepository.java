package b2b2c.repository;

import java.util.ArrayList;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import b2b2c.model.CartModel;


@Repository
public interface CartRepository extends JpaRepository<CartModel, Integer> {
	
	CartModel getByCartPaintIdAndCartOrderId(int cartPaintId, int cartOrderId);
	
	ArrayList<CartModel> getCartByCartOrderId(int cartOrderId);
	
//	@Query(value="SELECT * FROM tblcart WHERE cart_coupon_id=:cart_coupon_id", nativeQuery = true)
//	CartModel layBangCoupon(@Param("cart_coupon_id") int cartCouponId);
	
}
