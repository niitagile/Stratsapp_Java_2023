package com.example;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contemp")
public class Contract_Employee extends Employee{
	@Column
private float pay_per_hr;
	@Column
private int contract_duration;
public float getPay_per_hr() {
	return pay_per_hr;
}
public void setPay_per_hr(float pay_per_hr) {
	this.pay_per_hr = pay_per_hr;
}
public int getContract_duration() {
	return contract_duration;
}
public void setContract_duration(int contract_duration) {
	this.contract_duration = contract_duration;
}

}
