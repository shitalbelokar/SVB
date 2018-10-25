package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("/")
public String registerPage(){
	System.out.println("in loginpage");
	return "Register";
}
}
