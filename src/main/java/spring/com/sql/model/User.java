//package spring.com.sql.model;
//
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "User")
//public class User {
//
//	@Id
//	@Column(name = "UserId")
//	private int userId;
//	@Column(name = "FirstName")
//	private String firstName;
//	@Column(name = "LastName")
//	private String lastName;
//	@Column(name = "Age")
//	private int age;
//	@OneToMany(targetEntity=Orders.class, mappedBy="user", fetch=FetchType.EAGER)
//	private List<Orders> orders;
//
//	public int getUserId() {
//		return userId;
//	}
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	@Override
//	public String toString() {
//		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
//				+ ", orders=" + "" + "]";
//	}
//	
//	
//}
