package ptit.edu.mywebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ptit.edu.mywebapp.entity.User;
import ptit.edu.mywebapp.service.UserNotFoundException;
import ptit.edu.mywebapp.service.UserService;

import java.util.List;

@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/users")
    public  String showUserList(Model model){
        List<User> listUsers=userService.listAll();
        model.addAttribute("listUsers",listUsers);
        return "listUsers";
    }
    @GetMapping("/users/new")
    public String newUser(Model model){
        model.addAttribute("user",new User());
        return "add";
    }
    @PostMapping("/users/save")
    public String saveUser(User user){
        userService.save(user);
        return "redirect:/users";
    }
    @GetMapping("/users/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) throws UserNotFoundException {
     try {
         userService.get(id);
     }catch (UserNotFoundException e){

     }
        return "hello";
    }
}
