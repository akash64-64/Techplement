package com.Calculator.calculatorApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Calculator.calculatorApp.Controller.Model.calcModel;
import com.Calculator.calculatorApp.Controller.Model.userModel;
import com.Calculator.calculatorApp.Controller.Repository.userRepository;
import com.Calculator.calculatorApp.Service.calcService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class calcController {
	
	@Autowired
	private userRepository repo;
	
	@Autowired
	private calcService service;
	
	@RequestMapping("/")
	public String sign() {
		
		return "signin";
	}
	
	@RequestMapping("/send")
	public String signin(@RequestParam(required=false,name="uname")String name,@RequestParam(required=false,name="pwd")String pwd,@RequestParam(required=false,name="cpwd")String cpwd) {
		
		if(pwd.equals(cpwd)){
			userModel  user= new userModel(name,pwd);
			service.insertUser(user);
			return "login";
		}else {
			return "signin";
		}
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam(required=false,name="uname")String name,@RequestParam(required=false,name="pwd")String pwd,HttpServletRequest req) {
		userModel existingUser=repo.findByUname(name);
		  if(pwd.equals(existingUser.getPassword())) {
			existingUser.setEnabled(true);
			service.insertUser(existingUser);
			return "calculator_home";
		}else {
			return"login";
		}
	}
	
	@RequestMapping("/home")
	public String home() {
		
		return "calculator_home";
	}
	
	@RequestMapping("/success")
	public String success(@RequestParam("firstnum")String fnum ,@RequestParam("secondnum")String snum,@RequestParam("op")String op,@RequestParam("result")String res,Model model) {
		System.out.println(fnum+" "+snum+" "+op+" "+res);
		calcModel c=new calcModel(Double.parseDouble(fnum),Double.parseDouble(snum),op,Double.parseDouble(res));
		service.insert(c);
		model.addAttribute("data",res);
		return "calculator_home";
	}
	
	
	
	

}
