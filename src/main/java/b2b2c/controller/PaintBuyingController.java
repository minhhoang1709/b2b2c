package b2b2c.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import b2b2c.dto.CouponDto;
import b2b2c.dto.PaintDto;
import b2b2c.service.PaintBuyingService;

@Controller
@RequestMapping(path="/api")
public class PaintBuyingController {
	@Autowired PaintBuyingService paintBuyingService;
	
	@RequestMapping(path="/paint/coupon/product", method={ RequestMethod.GET })
	@ResponseBody
	public PaintDto enterCoupon(String couponCode) {
		PaintDto paintDto = new PaintDto();
		CouponDto couponDto = new CouponDto();
		couponDto = paintBuyingService.getCouponByCode(couponCode);
		paintDto = paintBuyingService.getPaintDtoByCouponCode(couponCode);
		int newprice = paintDto.getPaintPrice()-(paintDto.getPaintPrice()*couponDto.getCouponDiscountPercent()/100);
		paintDto.setPaintPrice(newprice);
		return paintDto;
	}
	
	@RequestMapping(path="/get/coupon", method={ RequestMethod.GET })
	@ResponseBody
	public CouponDto getCoupon(String couponCode) {
		CouponDto couponDto = new CouponDto();
		couponDto = paintBuyingService.getCouponByCode(couponCode);
		return couponDto;
	}
}
