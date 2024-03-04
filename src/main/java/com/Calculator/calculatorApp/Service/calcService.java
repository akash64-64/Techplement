package com.Calculator.calculatorApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Calculator.calculatorApp.Controller.Model.calcModel;
import com.Calculator.calculatorApp.Controller.Model.userModel;
import com.Calculator.calculatorApp.Controller.Repository.calcRepository;
import com.Calculator.calculatorApp.Controller.Repository.userRepository;

@Service
public class calcService {
	
	@Autowired
	private calcRepository repo;
	
	@Autowired
	private userRepository repou;
	
	public void insert(calcModel calc) {
		repo.save(calc);
	}
	
	public void insertUser(userModel calc) {
		repou.save(calc);
	}

}
