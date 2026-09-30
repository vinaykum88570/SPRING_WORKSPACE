package com.spring.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("product.xml");
		ProductDetails product = (ProductDetails) context.getBean("product");
		Map<String, Integer> products = product.getProducts();
		Set<String> productName = products.keySet();
		
		
//		for (String s : productName) {
//			System.out.println("key "+s);
//		}
//		Collection<Integer> values = products.values();
//		for (Integer i : values) {
//			System.out.println("values "+i);
//		}
//		
		Set<Entry<String, Integer>> entrySet = products.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
