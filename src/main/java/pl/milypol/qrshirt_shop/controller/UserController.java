package pl.milypol.qrshirt_shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.milypol.qrshirt_shop.entity.User;
import pl.milypol.qrshirt_shop.repository.UserRepository;

import javax.validation.Valid;

@Controller
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping(value = "/users")
    public String singUp(Model model) {
        model.addAttribute("user" , new User());
        return "User/add";
    }

    @PostMapping(value = "/users")
    public String addUser(@Valid User user, BindingResult result) {
        if(result.hasErrors()){
            return "User/add";
        }
        userRepository.save(user);
        return "home";
    };
    @GetMapping(value = "/users/{id}")
    public String userData (@PathVariable Long id, Model model) {
        model.addAttribute("user" , userRepository.findById(id));
        return"User/edit";
    }
}
