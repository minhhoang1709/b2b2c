package b2b2c.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import b2b2c.dto.PaintDto;

import b2b2c.service.CartService;
import b2b2c.service.CouponService;
import b2b2c.service.PaintBuyingService;
import b2b2c.service.PaintService;


@Controller
@RequestMapping(path="/api")
public class PaintBuyingController {
	@Autowired PaintBuyingService paintBuyingService;
	@Autowired CouponService couponService;
	@Autowired CartService cartService;
	@Autowired PaintService paintService;
	
	@RequestMapping(path="/user/invite", method={ RequestMethod.GET })
	@ResponseBody
	public String enterInvite(String couponCode) {
		PaintDto paintDto = new PaintDto();
		paintDto = paintBuyingService.getPaintDtoByInviteCode(couponCode);
		if(paintDto!=null) {
			return("YOU INVITED TO BUY A " +paintDto.getPaintName()+" WITH 0VND");
		}else {
			return("INVALID INVITE CODE");
		}
	}
	
	@RequestMapping(path="/user/invite/accept", method={ RequestMethod.POST })
	@ResponseBody
	public String acceptInvite(String couponCode, int userId, int orderId) {
		 boolean flag = paintBuyingService.acceptInviteCode(couponCode, userId, orderId);
		 if(flag==true) {
			 return "ADDED TO YOUR CART";
		 }else {
			 return "INVALID INVITE CODE";
		 }
		 
	}
	
	@RequestMapping(path="/coupon/enter", method={ RequestMethod.POST })
	@ResponseBody
	public String enterCouponCode(String couponCode, int paintId, int userId, int orderId) {
		
		boolean flag = paintBuyingService.acceptCoupon(couponCode, paintId, userId, orderId);
		if(flag==true) {
			return "APPLIED YOUR COUPON TO YOUR PAINT";
		}else {
			return "INVALID COUPON CODE";
		}
		
	}
	
	@RequestMapping(path="/product/add", method={ RequestMethod.POST })
	@ResponseBody
	public String addToCart(int paintId, int paintQuantity, int orderId) {
		paintService.addToCart(paintId, paintQuantity, orderId);
		return("ADDED TO CART");
	}
}
