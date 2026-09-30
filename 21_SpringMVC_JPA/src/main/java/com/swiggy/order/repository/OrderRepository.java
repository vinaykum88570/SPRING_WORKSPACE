package com.swiggy.order.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swiggy.order.entity.SwiggyOrders;
import com.swiggy.order.response.OrderResponse;

@Repository
public interface OrderRepository extends JpaRepository<SwiggyOrders, String>{

	List<SwiggyOrders> findByEmailIdAndOrderstatus(String emailId, String orderStaus);

}


