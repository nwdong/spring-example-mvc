package spring.example.mvc.web;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import spring.example.mvc.domain.Example2User;
import spring.example.mvc.service.Example2UserRepository;

@Controller
public class Example2Controller {
	
	private final Logger log = LoggerFactory.getLogger(Example2Controller.class);

	private Example2UserRepository repo;

	@Autowired
	public Example2Controller(Example2UserRepository repo){
		this.repo = repo;
	}
	
	@GetMapping("/example2-register")
	public String register(Model model) {
		log.debug("/example2-register: get");		
		model.addAttribute("example2user", new Example2User());
		return "example2RegisterForm";
	}
	
	@PostMapping("/example2-register")
	public String processRegister(@Valid @ModelAttribute("example2user") Example2User user, Errors errors, Model model){
		if(errors.hasErrors()){
			log.debug("/example2-register: there are form validation errors");
			return "example2RegisterForm";
		}
		
		
		log.debug("/example2-register: save user");			
		repo.save(user);

		return "redirect:/example2/" + user.getUsername();
	}
	
	@GetMapping(value="/example2/{username}")
	public String showProfile(@PathVariable String username, Model model){
		log.debug("/example2/{username}: profile display");			
		Example2User user = repo.findByUsername(username);
		model.addAttribute("example2user", user);
		return "example2Profile";
	}
	
}
