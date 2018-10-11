package CollectionsActivity;

import java.util.Date;

public class Order {
	private String orderId;
	private String orderDetails;
	private Date orderDate;
	public Order(String orderId, String orderDetails, Date orderDate) throws OrderNotValidException {
		this.orderId = orderId;
		this.orderDetails = orderDetails;
		this.orderDate = orderDate;
		
		if(orderId.length()<3)
			throw new OrderNotValidException("Order Id should be atleast 3 character long");
		if(orderId.charAt(0)!='O')
			throw new OrderNotValidException("First character of Order Id should be O");
	
	}
	public String getOrederId() {
		return orderId;
	}
	public void setOrederId(String orederId) {
		this.orderId = orederId;
	}
	public String getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String toString()
	{
		return "OrderID:"+orderId+" Order details:"+orderDetails+" Order date: "+orderDate;
	}

	
}
