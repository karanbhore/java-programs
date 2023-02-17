package com.prowings.OOPs;

public class Student {

	int id;
	String name;
	

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (id+" "+name);
	}
	


	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student obj = new Student(1, "Ramesh");
		Student obj1 = new Student(2, "Suresh");
		obj.display();
		obj1.display();
//System.out.println(obj.toString());
	}

}
