package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.UserService;
import com.example.demo.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
private UserService userService;

public UserRegistrationController(UserService userService) {
	super();
	this.userService = userService;
}
@GetMapping
public String showRegistrationForm() {
	return "registration";
}
@PostMapping
public String registerUserAccounString(@ModelAttribute("user")UserRegistrationDto registrationdto) {
	userService.save(registrationdto);
	return "redirect:/registration?success";
}

}
