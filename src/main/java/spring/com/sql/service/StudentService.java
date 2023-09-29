package spring.com.sql.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.com.sql.model.Address;
import spring.com.sql.model.Laptop;
import spring.com.sql.model.Student;
import spring.com.sql.repo.LaptopRepo;
import spring.com.sql.repo.StudentRepo;
import spring.com.sql.response.StudentResponse;

@Service
public class StudentService {

	@Autowired
	StudentRepo repo;
	@Autowired
	LaptopRepo laptopRepo;

	@Autowired
	EntityManager entityManager;
	
	public Student saveStudent(Student student) {
    student.setLaptop(student.getLaptop());
   

		return repo.save(student);
	}

	public List<Student> getData() {

		String s1= (String) entityManager.createNativeQuery("select s.name from student s where s.student_id =?").setParameter(1, 11).getSingleResult();
		System.out.println(s1);
		List<Student> list= new ArrayList<Student>();
		List<Object[]> obj=repo.getAll();
		List<StudentResponse> studentResponses=repo.getValues();
		System.out.println(studentResponses);

		obj.stream().forEach(object -> {
			Student student = new Student();
			Laptop laptop= new Laptop();
			if(object[0] != null) {
				student.setStudentId((int) object[0]);
			}
			if(object[1] != null) {
				student.setCourse((object[1].toString()));
			}
			if(object[2] != null) {
				student.setName((object[2].toString()));
			}
			if(object[3] != null) {
				laptop.setLaptopId(((int) object[3]));
			}
			if(object[4] != null) {
				laptop.setModel((object[4]).toString());
			}
			if(object[5] != null) {
				laptop.setPrice((((BigInteger)object[5])));
			}
			student.setLaptop(laptop);

			list.add(student);
		});

		return list;
	}
	
	public String saveAddress() {
		
		Student s= new Student();
		s.setCourse("Sql");
		s.setName("kiran");
		
		Address address = new Address();
		address.setDist("medak");
		address.setId(6);
		address.setPincode("503102");
		address.setState("TS");
		address.setVillage("val");
		address.setStudent(s);
		
		Address address1 = new Address();
		address1.setDist("siddipet");
		address1.setId(5);
		address1.setPincode("503100");
		address1.setState("TS");
		address1.setVillage("sap");
		address1.setStudent(s);
		List<Address> list = new ArrayList<Address>();
		list.add(address1);
		list.add(address);
		s.setAddresses(list);
		Student student=repo.save(s);
		System.out.println(student);
		return "save";
	}
}
