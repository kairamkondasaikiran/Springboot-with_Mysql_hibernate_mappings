package spring.com.sql.response;

import java.math.BigInteger;

public class StudentResponse {

	private int studentId;
	private String course;
	private String name;
	private int laptopId;
	private String model;
	private BigInteger price;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public BigInteger getPrice() {
		return price;
	}
	public void setPrice(BigInteger price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "StudentResponse [studentId=" + studentId + ", course=" + course + ", name=" + name + ", laptopId="
				+ laptopId + ", model=" + model + ", price=" + price + "]";
	}
	
	
}
