package com.prowings.codePumkin;

public class Demo4 {

	public static void add(int... a) {
		System.out.println("1");
	}
	public static void add(Integer...a) {
		System.out.println("2");
	}
	public static void main(String[] args) {
		add(10,20);
	}
	
	
	
	
}
