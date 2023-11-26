package com.pathfinder.web;

import com.pathfinder.model.dto.UserRegistrationDTO;
import com.pathfinder.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AuthController {

    private AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @ModelAttribute("userRegistrationDTO")
    public UserRegistrationDTO initForm(){
        return new UserRegistrationDTO();
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String doRegister(@Valid UserRegistrationDTO userRegistrationDTO,
                            BindingResult bindingResult,
                            RedirectAttributes redirectAttributes) {
        System.out.println(userRegistrationDTO.toString());

        if (bindingResult.hasErrors()){
            //pass dto to template
            redirectAttributes.addFlashAttribute("userRegistrationDTO", userRegistrationDTO);
            //pass errors to template
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.UserRegistrationDTO", bindingResult);

            return "redirect:/register";
        }

        this.authService.register(userRegistrationDTO);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";

    }
}
