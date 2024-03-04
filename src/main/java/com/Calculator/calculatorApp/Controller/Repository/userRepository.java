package com.Calculator.calculatorApp.Controller.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Calculator.calculatorApp.Controller.Model.userModel;

@Repository
public interface userRepository extends CrudRepository<userModel,Integer>{
	public userModel findByUname(String name);
}
