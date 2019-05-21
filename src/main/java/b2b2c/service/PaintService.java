package b2b2c.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import b2b2c.dto.PaintDto;
import b2b2c.model.CartModel;
import b2b2c.model.CouponModel;
import b2b2c.model.PaintModel;
import b2b2c.repository.CartRepository;
import b2b2c.repository.PaintRepository;
import b2b2c.util.B2b2cModelMapper;

@Service
public class PaintService {

	@Autowired
	private PaintRepository paintRepository;
	
	@Autowired
	private B2b2cModelMapper b2b2cModelMapper;
	
	@Autowired
	private CartRepository cartRepository;
	
	public PaintDto getPaintById(int paintId) {
		PaintModel paintModel = paintRepository.findOne(paintId);
		PaintDto paintDto = b2b2cModelMapper.convertToDto(paintModel);
		return paintDto;
	}
	
	public void addToCartByInvite(PaintDto paintDto, CouponModel couponModel) {
		CartModel cartModel = new CartModel();
		cartModel.setCartItemId(paintDto.getPaintId());
		cartModel.setCartPaintQuantity(couponModel.getCouponProductCount());
		cartModel.setCartCouponId(couponModel.getCouponId());
		cartModel.setCartCouponTitle(couponModel.getCouponTitle());
		cartModel.setCartOderId(1);
		cartModel.setCartPaintFinalPrice(paintDto.getPaintPrice());
		cartModel.setCartPaintName(paintDto.getPaintName());
		
		cartRepository.save(cartModel);
	}
}
