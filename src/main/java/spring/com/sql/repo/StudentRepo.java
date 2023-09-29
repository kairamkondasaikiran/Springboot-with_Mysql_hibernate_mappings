package spring.com.sql.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import spring.com.sql.model.Student;
import spring.com.sql.response.StudentResponse;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	@Query(value = "SELECT s.student_id,s.course,s.name,l.laptop_id,l.model,l.price FROM student s,laptop l where s.student_id=l.student_id",nativeQuery = true)
	public List<Object[]> getAll();
	
	@Query(value = "SELECT s.student_id,s.course,s.name,l.laptop_id,l.model,l.price FROM student s,laptop l where s.student_id=l.student_id",nativeQuery = true)
	public List<StudentResponse> getValues();
	
}
