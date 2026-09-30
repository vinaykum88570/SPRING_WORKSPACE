package com.swiggy.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swiggy.order.request.OrderRequest;
import com.swiggy.order.response.OrderResponse;
import com.swiggy.order.service.OrderService;



@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/create")
	public String createOrder(@RequestBody OrderRequest request) {
		
		String respone = orderService.createOrder(request);
		
		return respone;
	}

	//Get Orders by email and Order Status 
	@GetMapping("/email/{emailId}/status/{status}")
	public List<OrderResponse>  getOrdersByemaailIDAndStaus(@PathVariable String emailId, 
								@PathVariable("status") String orderStaus ){
		
		List<OrderResponse> orders=  orderService.getOrdersByemaailIDAndStaus(emailId, orderStaus);
		
		
		return orders;
	}
}

