package ABC2.ABC2;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDbOperations {
	
	
	@Autowired
	FlipakartOrderRepository flipakartOrderRepository; 
	
	public void addOrderDetaisl(FlipakartOrder order) {
		flipakartOrderRepository.save(order);
	}
	
	public void deleteOrderDetaisl(FlipakartOrder order) {
		flipakartOrderRepository.delete(order);
	}
	
	
	

}
