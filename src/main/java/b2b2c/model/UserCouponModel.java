package b2b2c.model;

import java.time.LocalDateTime;

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
	private String code;

	@Column(name = "coupon_id")
	private int couponId;

	@Column(name = "coupon_status")
	private boolean couponStatus;

	@Column(name = "coupon_started_date")
	private LocalDateTime couponStartedDate;

	@Column(name = "coupon_exprired_date")
	private LocalDateTime couponExpriredDate;

	@Column(name = "coupon_is_invite")
	private boolean couponIsInvite;

	@Column(name = "coupon_product_count")
	private byte couponProductCount;

	public UserCouponModel() {

	}

	public UserCouponModel(int userId, String code, int couponId, boolean couponStatus, LocalDateTime couponStartedDate,
			LocalDateTime couponExpriredDate, boolean couponIsInvite, byte couponProductCount) {
		this.userId = userId;
		this.code = code;
		this.couponId = couponId;
		this.couponStatus = couponStatus;
		this.couponStartedDate = couponStartedDate;
		this.couponExpriredDate = couponExpriredDate;
		this.couponIsInvite = couponIsInvite;
		this.couponProductCount = couponProductCount;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public boolean isCouponStatus() {
		return couponStatus;
	}

	public void setCouponStatus(boolean couponStatus) {
		this.couponStatus = couponStatus;
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

	public boolean isCouponIsInvite() {
		return couponIsInvite;
	}

	public void setCouponIsInvite(boolean couponIsInvite) {
		this.couponIsInvite = couponIsInvite;
	}

	public byte getCouponProductCount() {
		return couponProductCount;
	}

	public void setCouponProductCount(byte couponProductCount) {
		this.couponProductCount = couponProductCount;
	}

}
