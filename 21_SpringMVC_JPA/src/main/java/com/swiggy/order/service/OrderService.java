package com.swiggy.order.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiggy.order.entity.SwiggyOrders;
import com.swiggy.order.repository.OrderRepository;
import com.swiggy.order.request.OrderRequest;
import com.swiggy.order.response.OrderResponse;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderReposity;

	public String createOrder(OrderRequest request) {

		SwiggyOrders order = new SwiggyOrders();
		order.setAmount(request.getAmount());
		order.setCity(request.getCity());
		order.setEmailId(request.getEmailId());
		order.setOrderID(request.getOrderID());
		order.setOrderstatus(request.getOrderstatus());

		orderReposity.save(order);

		return "Order Creeated Successfully";
	}

	public List<OrderResponse> getOrdersByemaailIDAndStaus(String emailId, String orderStaus) {

		List<SwiggyOrders> orders = orderReposity.findByEmailIdAndOrderstatus(emailId, orderStaus);

		List<OrderResponse> allOrders=  orders.stream().map(v -> new OrderResponse(

				v.getOrderID(), v.getOrderstatus(), v.getAmount(), v.getEmailId(), v.getCity()

		)).collect(Collectors.toList());

		return allOrders;
		
		
	}

}
