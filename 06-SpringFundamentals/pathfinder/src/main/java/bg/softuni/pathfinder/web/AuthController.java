package bg.softuni.pathfinder.web;

import bg.softuni.pathfinder.model.dto.UserRegistrationDTO;
import bg.softuni.pathfinder.service.AuthService;
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
    public UserRegistrationDTO initForm() {
        return new UserRegistrationDTO();
    }

    //    /register
    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String doRegister(@Valid UserRegistrationDTO userRegistrationDTO,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes) {
        System.out.println(userRegistrationDTO.toString());

//        bindingResult.addError();
        if (bindingResult.hasErrors()) {
            //pass dto to template
            redirectAttributes.addFlashAttribute("userRegistrationDTO", userRegistrationDTO);
            //pass error to template
            redirectAttributes.addFlashAttribute("org.springframword.validation.BindingResult.userRegistrationDTO", bindingResult);
            return "redirect:/register";

        }

        //insert in DB
        this.authService.register(userRegistrationDTO);

        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
//    /login


}
