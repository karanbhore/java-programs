package com.prowings.OOPs;

public class Employee {

	int id;
	String name;
	Address adress;

	public Employee(int id, String name, Address adress) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(adress.city + " " + adress.state + " " + adress.country);

	}

	public static void main(String[] args) {
		Address add = new Address("GZB", "UP", "INDIA");
		Address add1 = new Address("BANARAS", "UP", "INDIA");

		Employee emp = new Employee(1, "Rajesh", add);
		Employee emp1 = new Employee(2, "Suresh", add1);
		emp.display();
		emp1.display();
	}

}
