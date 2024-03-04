package com.Calculator.calculatorApp.Controller.Model;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class userModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userId")
	private int id;
	
	private String uname;
	
	private String password;
	
	private boolean enabled;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public userModel(String uname, String password) {
		this.uname = uname;
		this.password = password;
	}
	
	public userModel() {
		
	}

}
