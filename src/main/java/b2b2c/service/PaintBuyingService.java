package b2b2c.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import b2b2c.dto.CouponDto;
import b2b2c.dto.PaintDto;
import b2b2c.model.CouponModel;
import b2b2c.model.PaintModel;
import b2b2c.repository.CouponRepository;

@Service
public class PaintBuyingService {
	private static final ModelMapper modelMapper = new ModelMapper();
	
	@Autowired
	private CouponRepository couponRepository;
	
	@Autowired
	private PaintService paintService;
	
	public CouponDto getCouponByCode(String couponCode) {
		CouponDto couponDto = new CouponDto();
		couponDto.setCouponCode(couponCode);
		CouponModel couponModel = couponRepository.findByCouponCode(couponCode);
		couponDto = convertToDto(couponModel);
		return couponDto;
	}
	
	public PaintDto getPaintDtoByCouponCode(String couponCode) {
		PaintDto paintDto = new PaintDto();
		CouponModel couponModel = couponRepository.findByCouponCode(couponCode);
		paintDto = paintService.getPaintById(couponModel.getCouponPaintId());
		
		return paintDto;
	}
	
	private CouponDto convertToDto(CouponModel couponModel) {
		CouponDto couponDto = modelMapper.map(couponModel, CouponDto.class);
		return couponDto;
	}
}
