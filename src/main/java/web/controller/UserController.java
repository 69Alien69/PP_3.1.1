package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    UserService userService;

    private UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    private String getUsers(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "users";
    }

}
