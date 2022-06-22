package ptit.edu.mywebapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import ptit.edu.mywebapp.entity.User;
import ptit.edu.mywebapp.repository.UserRepository;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryTest {
@Autowired private UserRepository repository;
    @Test
    public void testAddNew(){
         User user=new User();
         user.setEmail("hello@gmai.com");
         user.setPassword("12345");
         user.setFirstName("Duong Xuan");
         user.setLastName("Khue");
         repository.save(user);
     }
     @Test
    public  void findAll(){
         Iterable <User> users=repository.findAll() ;
         for (User user:
                 users
              ) {
             System.out.println(user);
         }
     }
     @Test
    public void findById(){
         Optional user=repository.findById(6);
         if(user.isEmpty()){
             System.out.println("don't find by id");
         }
         else {
             System.out.println("find successfully !");
             System.out.println(user);
         }
     }
     @Test
    public  void deleteById(){
        repository.deleteById(9);
         System.out.println("delete by id successfully !");

     }
     @Test
    public void checkExistById(){
         System.out.println(" result: "+ repository.existsById(11));
     }
}
