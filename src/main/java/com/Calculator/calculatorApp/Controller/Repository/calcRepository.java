package com.Calculator.calculatorApp.Controller.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Calculator.calculatorApp.Controller.Model.calcModel;

@Repository
public interface calcRepository extends CrudRepository<calcModel,Integer> {
	
}
