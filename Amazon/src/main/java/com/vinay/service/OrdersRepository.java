package com.vinay.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.vinay.response.SwiggyOrders;
import com.vinay.response.SwiggyOrdersResponse;

@Component
public interface OrdersRepository extends JpaRepository<SwiggyOrders,Integer> {

	List<SwiggyOrders> findByCity(String city);

	
	
}
