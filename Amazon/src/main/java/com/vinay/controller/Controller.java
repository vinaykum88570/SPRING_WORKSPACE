package com.vinay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.response.SwiggyOrders;
import com.vinay.response.SwiggyOrdersResponse;
import com.vinay.service.OrderService;


@RestController
public class Controller {

	@Autowired
	OrderService service;
	
	@GetMapping("/get/city/{city}")
	public List<SwiggyOrdersResponse> getCityList(@PathVariable String city){
		List<SwiggyOrdersResponse> orderList = service.getCitylist(city);
		return orderList;
	}
	
//	@GetMapping("/fetch")
//	public List<FlipkartOrdersRequest> getUserDetails() {
//
//	    List<FlipkartOrders> orders = service.getUserOrders();
//	    List<FlipkartOrdersResponse> responseList = new ArrayList<>();
//
//	    for (FlipkartOrders order : orders) {
//	    	FlipkartOrdersResponse response = new FlipkartOrdersResponse(); 
//	        
//	        response.setOrderID(order.getOrderID());
//	        response.setProductName(order.getProductName());
//	        response.setTotalAmount(order.getTotalAmount());
//
//	        responseList.add(response); 
//	    }
//
//	    return responseList;
//	}
	
}
