package ABC2.ABC2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flipkart_orders")
public class FlipakartOrder {

	@Id
	@Column(name = "orderId") // Primary key column
	private long orderID;

	@Column(name = "productName")
	private String productName;

	@Column(name = "totalAmount")
	private Float totalAmount;

	public long getOrderID() {
		return orderID;
	}

	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

}

