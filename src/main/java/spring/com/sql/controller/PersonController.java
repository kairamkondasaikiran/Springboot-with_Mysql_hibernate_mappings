package spring.com.sql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.com.sql.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;

	@GetMapping("persons")
	public ResponseEntity<?> getAll(){
		
		return  ResponseEntity.ok(personService.getAllPersons());
	}
}
