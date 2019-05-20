package b2b2c.dto;

import java.time.LocalDateTime;

public class CouponDto {
	
	private String couponCode;
	private String couponTitle;
	private String couponSubtitle;
	private String couponDescription;
	private int couponPaintId;
	private byte couponDiscountPercent;
	private String couponStartedDate;
	private String couponExpriredDate;
	private byte couponProductCount;
	private boolean couponStatus;
	
	public CouponDto() {
	}
	
	public CouponDto(String couponCode, String couponTitle, String couponSubtitle, String couponDescription, int couponPaintId,
			byte couponDiscountPercent, String couponStartedDate, String couponExpriredDate,
			byte couponProductCount, boolean couponStatus) {
		this.couponCode = couponCode;
		this.couponTitle = couponTitle;
		this.couponSubtitle = couponSubtitle;
		this.couponDescription = couponDescription;
		this.couponPaintId = couponPaintId;
		this.couponDiscountPercent = couponDiscountPercent;
		this.couponStartedDate = couponStartedDate;
		this.couponExpriredDate = couponExpriredDate;
		this.couponProductCount = couponProductCount;
		this.couponStatus = couponStatus;
	}
	
	
	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getCouponTitle() {
		return couponTitle;
	}
	public void setCouponTitle(String couponTitle) {
		this.couponTitle = couponTitle;
	}
	public String getCouponSubtitle() {
		return couponSubtitle;
	}
	public void setCouponSubtitle(String couponSubtitle) {
		this.couponSubtitle = couponSubtitle;
	}
	public String getCouponDescription() {
		return couponDescription;
	}
	public void setCouponDescription(String couponDescription) {
		this.couponDescription = couponDescription;
	}
	public int getCouponPaintId() {
		return couponPaintId;
	}
	public void setCouponPaintId(int couponPaintId) {
		this.couponPaintId = couponPaintId;
	}
	public byte getCouponDiscountPercent() {
		return couponDiscountPercent;
	}
	public void setCouponDiscountPercent(byte couponDiscountPercent) {
		this.couponDiscountPercent = couponDiscountPercent;
	}
	public String getCouponStartedDate() {
		return couponStartedDate;
	}
	public void setCouponStartedDate(String couponStartedDate) {
		this.couponStartedDate = couponStartedDate;
	}
	public String getCouponExpriredDate() {
		return couponExpriredDate;
	}
	public void setCouponExpriredDate(String couponExpriredDate) {
		this.couponExpriredDate = couponExpriredDate;
	}
	public byte getCouponProductCount() {
		return couponProductCount;
	}
	public void setCouponProductCount(byte couponProductCount) {
		this.couponProductCount = couponProductCount;
	}
	public boolean isCouponStatus() {
		return couponStatus;
	}
	public void setCouponStatus(boolean couponStatus) {
		this.couponStatus = couponStatus;
	}
}
