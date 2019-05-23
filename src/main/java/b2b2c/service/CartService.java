package b2b2c.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import b2b2c.dto.CartDto;
import b2b2c.model.CartModel;
import b2b2c.model.CouponModel;
import b2b2c.repository.CartRepository;
import b2b2c.util.B2b2cModelMapper;

@Service
public class CartService {
	
	
	@Autowired
	private B2b2cModelMapper b2b2cModelMapper;
	
	@Autowired
	private CartRepository cartRepository;
	
	
	public void updateCart(int paintId,CouponModel couponModel, int orderId ) {
		CartModel nCartModel = new CartModel();
		nCartModel = cartRepository.getByCartPaintIdAndCartOrderId(paintId, orderId);
		nCartModel.setCartPaintQuantity(nCartModel.getCartPaintQuantity()-couponModel.getCouponProductCount());
		cartRepository.save(nCartModel);
		nCartModel.setCartItemId(0);
		nCartModel.setCartCouponId(couponModel.getCouponId());
		nCartModel.setCartCouponTitle(couponModel.getCouponTitle());
		int finalPrice = (int) (nCartModel.getCartPaintFinalPrice() - nCartModel.getCartPaintFinalPrice()*(couponModel.getCouponDiscountPercent()/100));
		nCartModel.setCartPaintFinalPrice(finalPrice);
		nCartModel.setCartPaintQuantity(couponModel.getCouponProductCount());
		cartRepository.save(nCartModel);
		
	}
	
	public List<CartDto> getCart(int cartOrderId){
		List<CartModel> cartList = new ArrayList<CartModel>();
		cartList = cartRepository.getCartByCartOrderId(cartOrderId);
		List<CartDto> cartDtoList = new ArrayList<CartDto>();
		for(CartModel item:cartList) {
			cartDtoList.add(b2b2cModelMapper.convertToDto(item));
		}
		return cartDtoList;
	}
	
	public void deleteCart(int cartOrderId) {
		cartRepository.deleteByCartOrderId(cartOrderId);
	}
	
	public void removeItem(int cartItemId) {
		cartRepository.deleteByCartItemId(cartItemId);
	}
}
