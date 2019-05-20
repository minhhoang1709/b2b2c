package b2b2c.model;

import javax.persistence.*;

@Entity
@Table(name="tblorder")
public class OrderModel{
	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int orderId;
	
	@Column(name="order_user_id")
	private int orderUserId;
	
	@Column(name="order_created_date")
	private int orderCreatedDate;
	
	@Column(name="order_total")
	private int orderTotal;
	
	@Column(name="order_delivery_address")
	private int orderDeliveryAddress;
	
	@Column(name="order_customer_fullname")
	private String orderCustomerFullname;
	
	@Column(name="order_customer_phone")
	private String orderCustomerPhone;
	
	@Column(name="order_notes")
	private String orderNotes;
	
	public OrderModel() {
		
	}

	public OrderModel(int orderId, int orderUserId, int orderCreatedDate, int orderTotal, int orderDeliveryAddress,
			String orderCustomerFullname, String orderCustomerPhone, String orderNotes) {
		this.orderId = orderId;
		this.orderUserId = orderUserId;
		this.orderCreatedDate = orderCreatedDate;
		this.orderTotal = orderTotal;
		this.orderDeliveryAddress = orderDeliveryAddress;
		this.orderCustomerFullname = orderCustomerFullname;
		this.orderCustomerPhone = orderCustomerPhone;
		this.orderNotes = orderNotes;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getOrderUserId() {
		return orderUserId;
	}

	public void setOrderUserId(int orderUserId) {
		this.orderUserId = orderUserId;
	}

	public int getOrderCreatedDate() {
		return orderCreatedDate;
	}

	public void setOrderCreatedDate(int orderCreatedDate) {
		this.orderCreatedDate = orderCreatedDate;
	}

	public int getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}

	public int getOrderDeliveryAddress() {
		return orderDeliveryAddress;
	}

	public void setOrderDeliveryAddress(int orderDeliveryAddress) {
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
