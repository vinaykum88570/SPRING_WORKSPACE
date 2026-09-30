	package flipkart.entity;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {


			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.scan("flipkart.*");
			context.refresh();
			
			// Created Entity Object 
			FlipakartOrder order = new FlipakartOrder();
			order.setOrderID(1);
			order.setProductName("IPHONE");
			order.setTotalAmount(1000000.00f);
			
			// Pass Entity Object to Reposiory MEthod 
			OrderDbOperations dbOperation = 	context.getBean(OrderDbOperations.class);
			
			dbOperation.addOrderDetaisl(order);
			

	}

}
