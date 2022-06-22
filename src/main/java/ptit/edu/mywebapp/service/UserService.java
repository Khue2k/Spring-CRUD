package ptit.edu.mywebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.edu.mywebapp.entity.User;
import ptit.edu.mywebapp.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository repository;
    public List<User> listAll(){
        return (List<User>) repository.findAll();
    }
    public void save(User user) {
        repository.save(user);
    }
    public Optional<User> get(Integer id) throws UserNotFoundException {
        Optional<User> user=repository.findById(id);
        if(user.isPresent()){
            return user;
        }
        throw new UserNotFoundException();
    }
}
