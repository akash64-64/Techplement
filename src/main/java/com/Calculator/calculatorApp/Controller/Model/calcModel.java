package com.Calculator.calculatorApp.Controller.Model;

import jakarta.persistence.*;

@Entity
@Table(name="calculate")
public class calcModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="calcId")
	private int id;
	
	private double numone;
	
	private double numtwo;
	
	private String op;
	
	private double res;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public double getNumone() {
		return numone;
	}

	public void setNumone(double numone) {
		this.numone = numone;
	}

	public double getNumtwo() {
		return numtwo;
	}

	public void setNumtwo(double numtwo) {
		this.numtwo = numtwo;
	}

	public double getRes() {
		return res;
	}

	public void setRes(double res) {
		this.res = res;
	}
	

	public calcModel(double numone, double numtwo, String op, double res) {
		this.numone = numone;
		this.numtwo = numtwo;
		this.op = op;
		this.res = res;
	}

}


