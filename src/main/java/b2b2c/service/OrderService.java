package b2b2c.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import b2b2c.dto.CartDto;
import b2b2c.dto.OrderDto;
import b2b2c.model.OrderModel;
import b2b2c.model.UserModel;
import b2b2c.repository.OrderRepository;
import b2b2c.repository.UserRepository;
import b2b2c.util.B2b2cModelMapper;
import b2b2c.util.B2b2cStringToDate;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private B2b2cStringToDate b2b2cStringToDate;
	
	@Autowired
	private B2b2cModelMapper b2b2cModelMapper;
	
	@Autowired CartService cartService;
	
	public void createOrder(int userId) {
		OrderModel orderModel = new OrderModel();
		UserModel userModel = userRepository.findOne(userId);
		if(orderRepository.findInactiveOrder(userModel.getUserId())==0) {
			orderModel.setOrderUserId(userModel.getUserId());
			orderModel.setOrderStatus(true);
			orderModel.setOrderCustomerFullname(userModel.getUserFullname());
			orderModel.setOrderCustomerPhone(userModel.getUserPhone());
			orderModel.setOrderDeliveryAddress(userModel.getUserAddress());
			Date today = new Date();
			orderModel.setOrderCreatedDate(b2b2cStringToDate.dateToString(today));
			
			orderRepository.save(orderModel);
		}
	}
	
	public OrderModel changeOrder(int orderId) {
		List<CartDto> cartList = new ArrayList<CartDto>();
		cartList = cartService.getCart(orderId);
		OrderModel orderModel = orderRepository.findOne(orderId);
		int orderTotal = 0;
		for(CartDto item:cartList) {
			orderTotal+=item.getCartPaintFinalPrice()*item.getCartPaintQuantity();
		}
		orderModel.setOrderTotal(orderTotal);
		orderRepository.save(orderModel);
		
		return orderModel;
	}
	
	public OrderDto showOrder(int orderId) {
		
		return b2b2cModelMapper.convertToDto(changeOrder(orderId));
	}
	
	public OrderDto order(int orderId){
		
		OrderModel orderModel = changeOrder(orderId);
		orderModel.setOrderStatus(false);
		Date today = new Date();
		orderModel.setOrderOderedDate(b2b2cStringToDate.dateToString(today));
		cartService.deleteCart(orderId);
		return b2b2cModelMapper.convertToDto(orderModel);
	}
}
