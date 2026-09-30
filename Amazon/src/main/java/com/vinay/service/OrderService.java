package com.vinay.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinay.response.SwiggyOrders;
import com.vinay.response.SwiggyOrdersResponse;



@Service
public class OrderService {

	@Autowired
	OrdersRepository repostory;
	

	public List<SwiggyOrdersResponse> getCitylist(String city) {

	    List<SwiggyOrders> listOfCities = repostory.findByCity(city);

	    List<SwiggyOrdersResponse> list = new ArrayList<>();

	    for (SwiggyOrders order : listOfCities) {

	        SwiggyOrdersResponse response = new SwiggyOrdersResponse();

	        response.setOrderID(order.getOrderID());
	        response.setAmount(order.getAmount());
	        response.setCity(order.getCity());
	        response.setEmailID(order.getEmailID());
	        response.setOrderstatus(order.getOrderstatus());

	        list.add(response);
	    }
	    return list;
    }
	
	
	
}
