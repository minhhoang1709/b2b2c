package b2b2c.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import b2b2c.dto.PaintDto;
import b2b2c.service.CouponService;
import b2b2c.service.PaintBuyingService;

@Controller
@RequestMapping(path="/api")
public class PaintBuyingController {
	@Autowired PaintBuyingService paintBuyingService;
	@Autowired CouponService couponService;
	
	@RequestMapping(path="/user/invite", method={ RequestMethod.GET })
	@ResponseBody
	public String enterInvite(String couponCode) {
		PaintDto paintDto = new PaintDto();
		paintDto = paintBuyingService.getPaintDtoByInviteCode(couponCode);
		if(paintDto!=null) {
			return("YOU INVITED TO BUY A " +paintDto.getPaintName()+" WITH 0VND");
		}else {
			return("Mã INVITE không hợp lệ");
		}
	}
	
	@RequestMapping(path="/user/invite/accept", method={ RequestMethod.PUT })
	@ResponseBody
	public String acceptInvite(String couponCode, int userId) {
		 boolean flag = paintBuyingService.acceptInviteCode(couponCode, userId);
		 if(flag==true) {
			 return "ADDED TO YOUR CART";
		 }else {
			 return "INVALID INVITE CODE";
		 }
		 
	}
	
//	@RequestMapping(path="/user/invite", method={ RequestMethod.POST })
//	@ResponseBody
//	public PaintDto enterInviteCode(String couponCode) {
//		PaintDto paintDto = new PaintDto();
//		
//		return paintDto;
//	}
}
