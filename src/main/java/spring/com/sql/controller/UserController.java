//package spring.com.sql.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import spring.com.sql.service.UserService;
//
//@RestController
//public class UserController {
//
//	@Autowired
//	UserService service;
//	
//	@GetMapping("getUsers")
//	public ResponseEntity<?> getUsers(){
//		
//		return ResponseEntity.ok(service.getUsers());
//	}
//}
