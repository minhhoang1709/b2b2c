package b2b2c.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import b2b2c.dto.CouponDto;
import b2b2c.model.CouponModel;
import b2b2c.repository.CouponRepository;
import b2b2c.util.*;

@Service
public class CouponService {
	
	@Autowired
	private CouponRepository couponRepository;
	
	@Autowired
	private B2b2cModelMapper b2b2cModelMapper;
	
	@Autowired
	private B2b2cStringToDate b2b2cStringToDate;
	
	@Autowired
	private UserCouponService userCouponService;
	
	public CouponDto getCouponByCode(String couponCode) {
		CouponDto couponDto = new CouponDto();
		CouponModel couponModel = couponRepository.findByCouponCode(couponCode);
		couponDto = b2b2cModelMapper.convertToDto(couponModel);
		return couponDto;
	}
	
	public boolean checkValidDateCoupon(CouponModel couponModel) {
		Date today = new Date();
		Date started = b2b2cStringToDate.stringToDate(couponModel.getCouponStartedDate());
		Date exprired = b2b2cStringToDate.stringToDate(couponModel.getCouponExpriredDate());
		if(today.compareTo(started)==1&&today.compareTo(exprired)==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public CouponModel getInviteByCode(String couponCode) {
		
		CouponModel couponModel = couponRepository.findByCouponCode(couponCode);
		if(couponModel.isCouponIsInvite()==true&&couponModel.isCouponStatus()==true
				&&checkValidDateCoupon(couponModel)==true&&userCouponService.checkExist(couponCode)==true) {
			return couponModel;
		}else {
			return null;
		}
	}
	
	
	
	
}
