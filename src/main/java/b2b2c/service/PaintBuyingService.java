package b2b2c.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import b2b2c.dto.CouponDto;
import b2b2c.dto.PaintDto;
import b2b2c.model.CouponModel;
import b2b2c.util.B2b2cModelMapper;

@Service
public class PaintBuyingService {

	@Autowired
	private PaintService paintService;
	
	@Autowired
	private CartService cartService;

	@Autowired
	private B2b2cModelMapper b2b2cModelMapper;

	@Autowired
	private CouponService couponService;

	@Autowired
	private UserCouponService userCouponService;

	public PaintDto getPaintDtoByInviteCode(String couponCode) {
		PaintDto paintDto = new PaintDto();

		CouponModel couponModel = couponService.getInviteByCode(couponCode);
		CouponDto couponDto = b2b2cModelMapper.convertToDto(couponModel);
		if (couponDto != null) {
			paintDto = paintService.getPaintById(couponDto.getCouponPaintId());
			paintDto.setPaintPrice(0);
			return paintDto;

		} else {
			return null;
		}

	}

	public boolean acceptInviteCode(String couponCode, int userId, int orderId) {

		CouponModel couponModel = couponService.getInviteByCode(couponCode);
		PaintDto paintDto = getPaintDtoByInviteCode(couponCode);
		if (couponModel != null) {
			userCouponService.insertUserCoupon(couponModel, userId);
			paintService.addToCartByInvite(paintDto, couponModel, orderId);
			return true;
		} else {
			return false;
		}

	}
	
	public boolean acceptCoupon(String couponCode, int paintId, int userId, int orderId) {
		
		CouponModel couponModel = couponService.getCouponByCodev2(couponCode);
		if (couponModel != null) {
			userCouponService.insertUserCoupon(couponModel, userId);
			cartService.updateCart(paintId, couponModel, orderId);
			return true;
		} else {
			return false;
		}
	}
	
}