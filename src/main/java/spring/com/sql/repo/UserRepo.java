//package spring.com.sql.repo;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//
//import spring.com.sql.model.User;
//
//@Repository
//public interface UserRepo extends JpaRepository<User, Integer>{
//
//	@Query(value="SELECT * FROM user u, orders o where u.UserId=o.UserId",nativeQuery = true)
//	public List<User> getUser();
//}
