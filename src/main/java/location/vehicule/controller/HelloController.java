package location.vehicule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello Thymeleaf");
        return "index"; // maps to templates/index.html
    }
    @GetMapping("/visiteur")
    public String visiteur(Model model) {
        model.addAttribute("message", "Hello visiteur");
        return "index"; // maps to templates/index.html
    }
    @GetMapping("/loueur")
    public String loueur(Model model) {
        model.addAttribute("message", "Hello loueur");
        return "index"; // maps to templates/index.html
    }
    @GetMapping("/agent")
    public String agent(Model model) {
        model.addAttribute("message", "Hello agent");
        return "index"; // maps to templates/index.html
    }

}
