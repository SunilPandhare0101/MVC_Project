package com.kiranacademy.MVCSpring;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Branches {
	
	@Id
	private int Bid;
	private String Bname;
	@OneToMany
	private List<Branch1> branch1;
	@OneToMany
	private List<Branch2> branch2;
	
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public List<Branch1> getBranch1() {
		return branch1;
	}
	public void setBranch1(List<Branch1> branch1) {
		this.branch1 = branch1;
	}
	public List<Branch2> getBranch2() {
		return branch2;
	}
	public void setBranch2(List<Branch2> branch2) {
		this.branch2 = branch2;
	}
	@Override
	public String toString() {
		return "Branches [Bid=" + Bid + ", Bname=" + Bname + ", branch1=" + branch1 + ", branch2=" + branch2 + "]";
	}
	
	
	

}
