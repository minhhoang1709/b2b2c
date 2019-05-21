package b2b2c.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblusercoupon")
public class UserCouponModel {
	
	@Id
	@Column(name = "user_id")
	private int userId;

	@Column(name = "usercoupon_code")
	private String couponCode;

	@Column(name = "coupon_id")
	private int couponId;

	@Column(name = "coupon_started_date")
	private String couponStartedDate;

	@Column(name = "coupon_exprired_date")
	private String couponExpriredDate;

	@Column(name = "coupon_product_count")
	private byte couponProductCount;

	public UserCouponModel() {

	}

	public UserCouponModel(int userId, String couponCode, int couponId, String couponStartedDate,
			String couponExpriredDate, byte couponProductCount) {
		this.userId = userId;
		this.couponCode = couponCode;
		this.couponId = couponId;
		this.couponStartedDate = couponStartedDate;
		this.couponExpriredDate = couponExpriredDate;
		this.couponProductCount = couponProductCount;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
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

}
