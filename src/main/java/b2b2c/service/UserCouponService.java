package b2b2c.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import b2b2c.model.CouponModel;
import b2b2c.model.UserCouponModel;
import b2b2c.repository.UserCouponRepository;
import b2b2c.util.B2b2cStringToDate;

@Service
public class UserCouponService {
	@Autowired
	private UserCouponRepository userCouponRepository;
	
	@Autowired
	private B2b2cStringToDate b2b2cStringToDate;
	
	public boolean checkExist(String couponCode) {
		if(userCouponRepository.countByCouponCode(couponCode)==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void insertUserCoupon(CouponModel couponModel, int userId) {
		UserCouponModel userCouponModel = new UserCouponModel();
		userCouponModel.setCouponCode(couponModel.getCouponCode());
		userCouponModel.setUserId(userId);
		Date today = new Date();
		userCouponModel.setCouponId(couponModel.getCouponId());
		userCouponModel.setCouponStartedDate(b2b2cStringToDate.dateToString(today));
		userCouponModel.setCouponExpriredDate(couponModel.getCouponExpriredDate());
		userCouponModel.setCouponProductCount(couponModel.getCouponProductCount());
		userCouponRepository.save(userCouponModel);
	}
}
