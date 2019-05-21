package b2b2c.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblcoupon")
public class CouponModel {

	@Id
	@Column(name = "coupon_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int couponId;

	@Column(name = "coupon_code")
	private String couponCode;

	@Column(name = "coupon_title")
	private String couponTitle;

	@Column(name = "coupon_subtitle")
	private String couponSubtitle;

	@Column(name = "coupon_description")
	private String couponDescription;

	@Column(name = "coupon_paint_id")
	private int couponPaintId;

	@Column(name = "coupon_discount_percent")
	private float couponDiscountPercent;

	@Column(name = "coupon_started_date")
	private String couponStartedDate;

	@Column(name = "coupon_exprired_date")
	private String couponExpriredDate;

	@Column(name = "coupon_product_count")
	private byte couponProductCount;

	@Column(name = "coupon_is_invite")
	private boolean couponIsInvite;

	@Column(name = "coupon_status")
	private boolean couponStatus;

	public CouponModel() {

	}

	public CouponModel(int couponId, String couponCode, String couponTitle, String couponSubtitle,
			String couponDescription, int couponPaintId, float couponDiscountPercent, String couponStartedDate,
			String couponExpriredDate, byte couponProductCount, boolean couponIsInvite, boolean couponStatus) {
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.couponTitle = couponTitle;
		this.couponSubtitle = couponSubtitle;
		this.couponDescription = couponDescription;
		this.couponPaintId = couponPaintId;
		this.couponDiscountPercent = couponDiscountPercent;
		this.couponStartedDate = couponStartedDate;
		this.couponExpriredDate = couponExpriredDate;
		this.couponProductCount = couponProductCount;
		this.couponIsInvite = couponIsInvite;
		this.couponStatus = couponStatus;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
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

	public float getCouponDiscountPercent() {
		return couponDiscountPercent;
	}

	public void setCouponDiscountPercent(float couponDiscountPercent) {
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

	public boolean isCouponIsInvite() {
		return couponIsInvite;
	}

	public void setCouponIsInvite(boolean couponIsInvite) {
		this.couponIsInvite = couponIsInvite;
	}

	public boolean isCouponStatus() {
		return couponStatus;
	}

	public void setCouponStatus(boolean couponStatus) {
		this.couponStatus = couponStatus;
	}

}
