package com.kiranacademy.MVCSpring;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch2 {

	@Id
	private int chairs;
	private int laptops;
	
	
	public int getChairs() {
		return chairs;
	}
	public void setChairs(int chairs) {
		this.chairs = chairs;
	}
	public int getLaptops() {
		return laptops;
	}
	public void setLaptops(int laptops) {
		this.laptops = laptops;
	}
	@Override
	public String toString() {
		return "Branch1 [chairs=" + chairs + ", laptops=" + laptops + "]";
	}
	
}
