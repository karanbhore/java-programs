package com.prowings.codePumkin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;

public class Employee {

	private String firstName;
	private String lastName;
	private Date birthdate;
	private transient int age;

	public String getFirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return ("firstName : " + firstName + " \n lastName : " + lastName + " \nage : " + age + " \nbirthdate : "
//				+ birthdate);
//	}
//
//	public static void main(String[] args) {
//		Employee obj = new Employee();
//		obj.setAge(34);
//		System.out.println(obj.getAge());
//
//		obj.setBirthdate("1996, 9, 4");
//		System.out.println(obj.getBirthdate());
//
//		obj.setfirstName("Rakesh");
//		System.out.println(obj.getFirstName());
//
//		obj.setLastName("Choudhari");
//		System.out.println(obj.getAge());
//	}

	try

	{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empInfo.ser"));
		Employee emp = new Employee();
		emp.setfirstName("Code");
		emp.setLastName("Pumpkin");
		emp.setAge(26);
		emp.setBirthdate(new Date(1991, 7, 20));
		// Serialize the object
		oos.writeObject(emp);
		oos.close();
	}catch(
	Exception e11)
	{
		System.out.println(e11);
	}

	try
	{
		ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("empInfo.ser"));
		// Read the object back
		Employee readEmpInfo = (Employee) ooi.readObject();
		System.out.println(readEmpInfo.getFirstName());
		System.out.println(readEmpInfo.getLastName());
		System.out.println(readEmpInfo.getAge());
		System.out.println(readEmpInfo.getBirthdate());
		ooi.close();
	}catch(
	Exception e1)
	{
		System.out.println(e11);
	}
}}
