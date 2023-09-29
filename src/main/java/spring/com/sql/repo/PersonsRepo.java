package spring.com.sql.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring.com.sql.model.Persons;
import spring.com.sql.response.ResponseOptional;

@Repository
public interface PersonsRepo extends JpaRepository<Persons, Integer>{

	@Query(value = "SELECT * FROM persons",nativeQuery = true)
	public List<Persons> getList();
	
	@Query(value = "SELECT p.ID,p.LastName,p.FirstName,p.Age,a.village,a.dist,a.pincode,a.state FROM persons p,address a",nativeQuery = true)
	public List<Object> joinList();
	
	@Query(value = "SELECT * FROM persons",nativeQuery = true)
	public List<Object[]> getPersons();
}
