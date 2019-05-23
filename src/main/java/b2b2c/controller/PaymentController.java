package b2b2c.controller;

import java.util.ArrayList;
import java.util.List;
import b2b2c.dto.CartDto;
import b2b2c.dto.OrderDto;
import b2b2c.service.CartService;
import b2b2c.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/api")
public class PaymentController {

	@Autowired
	CartService cartService;
	
	@Autowired
	OrderService orderService;

	@RequestMapping(path = "/cart", method = { RequestMethod.GET })
	@ResponseBody
	public List<CartDto> showCart(int orderId) {
		List<CartDto> cart = new ArrayList<CartDto>();
		cart = cartService.getCart(orderId);
		return cart;
	}
	
//	@RequestMapping(path = "/order", method = { RequestMethod.GET })
//	@ResponseBody
//	public OrderDto order(int orderId) {
//		return orderService.order(orderId);
//	}
	
	@RequestMapping(path = "/order/show", method = { RequestMethod.GET })
	@ResponseBody
	public OrderDto preOrder(int orderId) {
		return orderService.showOrder(orderId);
	}
	
	@RequestMapping(path = "/order/order", method = { RequestMethod.PUT })
	@ResponseBody
	public OrderDto order(int orderId) {
		return orderService.order(orderId);
	}
	
	
	@RequestMapping(path = "/cart/remove", method = { RequestMethod.DELETE })
	@ResponseBody
	public void removeItemFromCart(int cartItemId) {
		cartService.removeItem(cartItemId);
	}
}
