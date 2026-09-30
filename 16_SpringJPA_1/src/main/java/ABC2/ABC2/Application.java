package ABC2.ABC2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application
{
	public static void main(String[] args) {


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FlipkartJpaConfiguration.class);

		
		// Created Entity Object 
		FlipakartOrder order = new FlipakartOrder();
		order.setOrderID(4);
		order.setProductName("VIVO");
		order.setTotalAmount(123123.00f);
		
		// Pass Entity Object to Reposiory MEthod 
		OrderDbOperations dbOperation = 	context.getBean(OrderDbOperations.class);
		
		dbOperation.addOrderDetaisl(order);
		System.out.println("Complete"+ order);
		

		FlipakartOrder deleteOrder = new FlipakartOrder();
		deleteOrder.setOrderID(4);
		dbOperation.deleteOrderDetaisl(deleteOrder);
}

}
