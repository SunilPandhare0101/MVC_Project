package com.kiranacademy.MVCSpring;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Variables {
	@Id
	private String username;
	private String name;
	private String email;
	private String password;
	@OneToMany
	private List<Branches> branch;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Branches> getBranch() {
		return branch;
	}
	public void setBranch(List<Branches> branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Variables [username=" + username + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", branch=" + branch + "]";
	}
	
	
	

}
