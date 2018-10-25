package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Employee;
import com.serviceI.ServiceI;

@Controller
public class HomeController {
@Autowired
ServiceI si;
@RequestMapping("/")
public String loginPage(){
	System.out.println("in loginpage");
	return "Login";
}
@RequestMapping("/registerpage")
public String registerPage(){
	System.out.println("in loginpage");
	return "Register";
}
@RequestMapping("/reg")
public String registerEmployee(@ModelAttribute Employee e,Model model){
	System.out.println("in loginpage");
	Employee em=si.registerEmployee(e);
	model.addAttribute("msg", "data saved----!");
	return "Login";
	
}
@RequestMapping("/log")
public String loginEmployee(@ModelAttribute Employee e,Model model){
	System.out.println("in loginpage");
	Employee em=si.findAllByUnAndPw(e.getUn(), e.getPw());
	if(em!=null){
		List<Employee>list=si.getAllRecord();
		model.addAttribute("data",list);
		return "Success";
	}
	else{
		model.addAttribute("msg", "wrong username or password----!");
		return "Login";
	}
	
}
}
