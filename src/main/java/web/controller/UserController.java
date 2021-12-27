package web.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("")
    public String infoUser(@AuthenticationPrincipal User user, ModelMap model) {
        model.addAttribute("user", user);
        return "userPage";
    }
}