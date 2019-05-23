package b2b2c.dto;

public class OrderDto {
	
	private int orderUserId;
	private int orderTotal;
	private String orderDeliveryAddress;
	private String orderCustomerFullname;
	private String orderCustomerPhone;
	private String orderNotes;
	
	public OrderDto() {
		
	}
	
	public OrderDto(int orderUserId, int orderTotal, String orderDeliveryAddress, String orderCustomerFullname,
			String orderCustomerPhone, String orderNotes) {
		this.orderUserId = orderUserId;
		this.orderTotal = orderTotal;
		this.orderDeliveryAddress = orderDeliveryAddress;
		this.orderCustomerFullname = orderCustomerFullname;
		this.orderCustomerPhone = orderCustomerPhone;
		this.orderNotes = orderNotes;
	}
	public int getOrderUserId() {
		return orderUserId;
	}
	public void setOrderUserId(int orderUserId) {
		this.orderUserId = orderUserId;
	}
	public int getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}
	public String getOrderDeliveryAddress() {
		return orderDeliveryAddress;
	}
	public void setOrderDeliveryAddress(String orderDeliveryAddress) {
		this.orderDeliveryAddress = orderDeliveryAddress;
	}
	public String getOrderCustomerFullname() {
		return orderCustomerFullname;
	}
	public void setOrderCustomerFullname(String orderCustomerFullname) {
		this.orderCustomerFullname = orderCustomerFullname;
	}
	public String getOrderCustomerPhone() {
		return orderCustomerPhone;
	}
	public void setOrderCustomerPhone(String orderCustomerPhone) {
		this.orderCustomerPhone = orderCustomerPhone;
	}
	public String getOrderNotes() {
		return orderNotes;
	}
	public void setOrderNotes(String orderNotes) {
		this.orderNotes = orderNotes;
	}
}
