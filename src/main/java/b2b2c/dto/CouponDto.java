package b2b2c.dto;

public class CouponDto {

	private String couponTitle;
	private String couponSubtitle;
	private String couponDescription;
	private int couponPaintId;
	private byte couponDiscountPercent;
	private byte couponProductCount;
	private boolean couponStatus;

	public CouponDto() {
	}

	public CouponDto(String couponTitle, String couponSubtitle, String couponDescription, int couponPaintId,
			byte couponDiscountPercent, byte couponProductCount, boolean couponStatus) {
		this.couponTitle = couponTitle;
		this.couponSubtitle = couponSubtitle;
		this.couponDescription = couponDescription;
		this.couponPaintId = couponPaintId;
		this.couponDiscountPercent = couponDiscountPercent;
		this.couponProductCount = couponProductCount;
		this.couponStatus = couponStatus;
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
