package b2b2c.dto;

import java.time.LocalDateTime;

public class UserCouponDto {
	
	private String code;
	private boolean couponStatus;
	private byte couponProductCount;
	private LocalDateTime couponStartedDate;
	private LocalDateTime couponExpriredDate;
	
	public UserCouponDto() {
		
	}
	
	public UserCouponDto(String code, boolean couponStatus, byte couponProductCount, LocalDateTime couponStartedDate,
			LocalDateTime couponExpriredDate) {
		this.code = code;
		this.couponStatus = couponStatus;
		this.couponProductCount = couponProductCount;
		this.couponStartedDate = couponStartedDate;
		this.couponExpriredDate = couponExpriredDate;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isCouponStatus() {
		return couponStatus;
	}
	public void setCouponStatus(boolean couponStatus) {
		this.couponStatus = couponStatus;
	}
	public byte getCouponProductCount() {
		return couponProductCount;
	}
	public void setCouponProductCount(byte couponProductCount) {
		this.couponProductCount = couponProductCount;
	}
	public LocalDateTime getCouponStartedDate() {
		return couponStartedDate;
	}
	public void setCouponStartedDate(LocalDateTime couponStartedDate) {
		this.couponStartedDate = couponStartedDate;
	}
	public LocalDateTime getCouponExpriredDate() {
		return couponExpriredDate;
	}
	public void setCouponExpriredDate(LocalDateTime couponExpriredDate) {
		this.couponExpriredDate = couponExpriredDate;
	}

}
