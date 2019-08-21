package com.example.stockspring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.User;
import com.example.stockspring.service.UserService;

@Controller
public class UserControllerImpl implements UserController {

	@Autowired
	UserService userservice;


@RequestMapping(path="/loginUser")
public String loginUser(Model model) throws Exception {
	User user=new User();
	model.addAttribute("user", user);
	return "login";
}

@RequestMapping(value = "/login", method = RequestMethod.POST)
public String submit(@ModelAttribute("user")  @Valid User user, BindingResult result1,Model model) {
	


	/*
	 * boolean res=;
	 * System.out.println(res);*/

	

	return "userlanding";

	
}

/*@RequestMapping(path="/userlanding")
public String userLanding(Model model) throws Exception {
	
	return "userlanding";
}*/

@RequestMapping(path="/signupUser")
public String signupUser(Model model) throws Exception {
	User user=new User();
	model.addAttribute("user", user);
	return "signup";
}
@RequestMapping(value = "/signup", method = RequestMethod.POST)
public String signup(@ModelAttribute("user") @Valid User user, BindingResult result,Model model) {
	/*boolean res=result.hasErrors();
	System.out.println(res);*/
	if(result.hasErrors()){
        
        return "signup";
	}
	return "redirect:/loginUser";
	
}


@Override
public void loginUser(User user) {
	// TODO Auto-generated method stub
	
}

}