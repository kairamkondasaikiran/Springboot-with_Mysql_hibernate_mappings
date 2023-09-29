//package spring.com.sql.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "Orders")
//public class Orders {
//
//	@Id
//	@Column(name = "OrderID")
//	private int orderId;
//	@Column(name = "OrderNumber")
//	private int orderNumber;
//	@ManyToOne
//	@JoinColumn(name="UserId")
//	private User user;
//	public int getOrderId() {
//		return orderId;
//	}
//	public void setOrderId(int orderId) {
//		this.orderId = orderId;
//	}
//	public int getOrderNumber() {
//		return orderNumber;
//	}
//	public void setOrderNumber(int orderNumber) {
//		this.orderNumber = orderNumber;
//	}
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
//	@Override
//	public String toString() {
//		return "Orders [orderId=" + orderId + ", orderNumber=" + orderNumber + ", user=" + user + "]";
//	}
//	
//	
//	
//}
