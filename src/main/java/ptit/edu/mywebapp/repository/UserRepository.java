package ptit.edu.mywebapp.repository;

import org.springframework.data.repository.CrudRepository;
import ptit.edu.mywebapp.entity.User;

public interface UserRepository extends CrudRepository<User,Integer> {
}
