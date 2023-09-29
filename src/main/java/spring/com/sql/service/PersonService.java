package spring.com.sql.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.com.sql.model.Persons;
import spring.com.sql.repo.PersonsRepo;
import spring.com.sql.response.ResponseOptional;

@Service
public class PersonService {
	
	@Autowired
	private PersonsRepo personsRepo;

	public List<Persons> getAllPersons(){
		
	List<Object> re=personsRepo.joinList();
	List<Persons> list;
	
	
	
	
		
	 List<Object[]> p= personsRepo.getPersons();
	int s=(int) p.get(0)[0];
	
	
	
	System.out.println(s);
		
		return  personsRepo.getList();
		
	
	}
}
