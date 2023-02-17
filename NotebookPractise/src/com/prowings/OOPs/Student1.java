package com.prowings.OOPs;

public class Student1 {

	String name;
	int id;

	public Student1(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	Student1(Student1 s) {
		id = s.id;
		name = s.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student1 obj = new Student1("Raj", 10);
		Student1 obj1 = new Student1(obj);
		obj.display();
		obj1.display();
	}

}
