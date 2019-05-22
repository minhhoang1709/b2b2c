package b2b2c.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import b2b2c.model.CartModel;


@Repository
public interface CartRepository extends JpaRepository<CartModel, Integer> {
	
	CartModel getByCartPaintIdAndCartOrderId(int cartPaintId, int cartOrderId);
	
	ArrayList<CartModel> getCartByCartOrderId(int cartOrderId);
	
}
