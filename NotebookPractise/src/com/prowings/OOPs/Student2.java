package com.prowings.OOPs;

public class Student2 {

	int rollNo;
	String name;
	static String college="PDEA";

	static void change() {
		college = "PDEA";
	}

	public Student2(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("rollNo: " + rollNo + " name: " + name + " college: "+college);

	}

	public static void main(String[] args) {
		Student2 obj = new Student2(1, "Ram");
		System.out.println(obj.toString());
		System.out.println();
	}

}
