package com.prowings.OOPs;

public class Employee1 extends Person {

	float salary;

	public Employee1(String name, String address, int age, float salary) {
		super(name, address, age);
		this.salary = salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString()+"salary "+salary);
	}

}
