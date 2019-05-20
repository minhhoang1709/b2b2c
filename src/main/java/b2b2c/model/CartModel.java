package b2b2c.model;

import javax.persistence.*;

@Entity
@Table(name = "tblcart")
public class CartModel {

	@Id
	@Column(name = "cart_item_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartItemId;

	@Column(name = "cart_order_id")
	private int cartOderId;

	@Column(name = "cart_paint_id")
	private int cartPaintId;
	
	@Column(name="cart_paint_name")
	private String cartPaintName;

	@Column(name = "cart_paint_quantity")
	private int cartPaintQuantity;

	@Column(name = "cart_coupon_id")
	private int cartCouponId;
	
	@Column(name="cart_coupon_title")
	private String cartCouponTitle;

	@Column(name = "cart_paint_final_price")
	private int cartPaintFinalPrice;

	public CartModel() {

	}

	public CartModel(int cartItemId, int cartOderId, int cartPaintId, String cartPaintName, int cartPaintQuantity, int cartCouponId,
			String cartCouponTitle, int cartPaintFinalPrice) {
		this.cartItemId = cartItemId;
		this.cartOderId = cartOderId;
		this.cartPaintId = cartPaintId;
		this.cartPaintName = cartPaintName;
		this.cartPaintQuantity = cartPaintQuantity;
		this.cartCouponId = cartCouponId;
		this.cartCouponTitle = cartCouponTitle;
		this.cartPaintFinalPrice = cartPaintFinalPrice;
	}

	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public int getCartOderId() {
		return cartOderId;
	}

	public void setCartOderId(int cartOderId) {
		this.cartOderId = cartOderId;
	}

	public int getCartPaintId() {
		return cartPaintId;
	}

	public void setCartPaintId(int cartPaintId) {
		this.cartPaintId = cartPaintId;
	}

	public String getCartPaintName() {
		return cartPaintName;
	}

	public void setCartPaintName(String cartPaintName) {
		this.cartPaintName = cartPaintName;
	}

	public int getCartPaintQuantity() {
		return cartPaintQuantity;
	}

	public void setCartPaintQuantity(int cartPaintQuantity) {
		this.cartPaintQuantity = cartPaintQuantity;
	}

	public int getCartCouponId() {
		return cartCouponId;
	}

	public void setCartCouponId(int cartCouponId) {
		this.cartCouponId = cartCouponId;
	}

	public String getCartCouponTitle() {
		return cartCouponTitle;
	}

	public void setCartCouponTitle(String cartCouponTitle) {
		this.cartCouponTitle = cartCouponTitle;
	}

	public int getCartPaintFinalPrice() {
		return cartPaintFinalPrice;
	}

	public void setCartPaintFinalPrice(int cartPaintFinalPrice) {
		this.cartPaintFinalPrice = cartPaintFinalPrice;
	}

}
