package spring.com.sql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import spring.com.sql.model.Student;
import spring.com.sql.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	@PostMapping("/saveStundet")
	public ResponseEntity<?> saveStudent(@RequestBody Student student ){

		return ResponseEntity.ok(service.saveStudent(student));

	}
	
	@GetMapping("/getofStudnet")
	public ResponseEntity<?> getofStudnet(){
		
		return ResponseEntity.ok(service.getData());
	}
	@PostMapping("/saveAddress")
	public ResponseEntity<?> saveAddress(){
		
		return ResponseEntity.ok(service.saveAddress());
		
	}
}
