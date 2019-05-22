package b2b2c.controller;

import java.util.ArrayList;
import java.util.List;
import b2b2c.dto.CartDto;
import b2b2c.service.CartService;
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

	@RequestMapping(path = "/cart", method = { RequestMethod.GET })
	@ResponseBody
	public List<CartDto> showCart(int orderId) {
		List<CartDto> cart = new ArrayList<CartDto>();
		cart = cartService.getCart(orderId);
		return cart;

	}
}
