package spring.example.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import spring.example.mvc.domain.Example1User;

@Controller
public class RegisterController {
	@GetMapping("/example1-register")
	public String register() {
		return "example1-register";
	}
	
	@PostMapping("/example1-register-next")
	public String postRegister(Example1User user, Model model){
		model.addAttribute("example1user", user);
		return "example1-register-next";
	}
	
}
