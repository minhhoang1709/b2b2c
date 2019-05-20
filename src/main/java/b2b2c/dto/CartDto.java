package b2b2c.dto;

public class CartDto {
	private String cartPaintName;
	private int cartPaintQuantity;
	private String cartCouponTitle;
	private int cartPaintFinalPrice;

	public CartDto() {
		
	}
	
	public CartDto(String cartPaintName, int cartPaintQuantity, String cartCouponTitle, int cartPaintFinalPrice) {
		this.cartPaintName = cartPaintName;
		this.cartPaintQuantity = cartPaintQuantity;
		this.cartCouponTitle = cartCouponTitle;
		this.cartPaintFinalPrice = cartPaintFinalPrice;
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
