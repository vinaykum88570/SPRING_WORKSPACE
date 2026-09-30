package com.flipcart.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.flipcart.orders.OrderManagement;

public class FlipkartAppliaction {
    public static void main(String[] args) {
	ApplicationContext context  = new FileSystemXmlApplicationContext("C:\\Users\\admin\\SPRING_FW_WORKSPACE\\C_BeanWiring\\Beans.xml");
	
	OrderManagement odMgmt = (OrderManagement) context.getBean("orderMgmt");
	
	System.out.println("NoOfOrders: "+odMgmt.getNoOfOrders());
	System.out.println("TotalAmmount: "+odMgmt.getTotalAmmount());
	System.out.println("OrderID: "+odMgmt.getOrder().getOrderID());
	System.out.println("OrderValue: "+odMgmt.getOrder().getOrderValue());
	System.out.println("ProductID: "+odMgmt.getOrder().getProduct().getProductID());
	System.out.println("productName: "+odMgmt.getOrder().getProduct().getProductName());
	
	

}
}
