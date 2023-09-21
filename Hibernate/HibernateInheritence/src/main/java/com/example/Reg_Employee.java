package com.example;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regemp")
public class Reg_Employee extends Employee {
	
	@Column
	private float salary;
	@Column
	private float bonus;
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
}
