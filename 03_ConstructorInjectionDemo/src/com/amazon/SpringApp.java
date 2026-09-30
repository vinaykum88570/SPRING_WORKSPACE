package com.amazon;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApp {
	public static void main(String[] args) {
		BeanFactory bean = new FileSystemXmlApplicationContext("C:\\Users\\admin\\SPRING_FW_WORKSPACE\\ConstructorInjectionDemo\\Beans.xml");
		Product p1 = (Product) bean.getBean("Iphones");
		
		
		System.out.println("ProductId ="+p1.getProductId());
		System.out.println("ProductName ="+p1.getProductName());
		System.out.println("Price ="+p1.getPrice());
		System.out.println("isExpired ="+p1.isExpired);
		System.out.println("products List ="+p1.products);
		System.out.println("product");
	}
}
