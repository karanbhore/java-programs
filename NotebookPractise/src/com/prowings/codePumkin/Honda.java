package com.prowings.codePumkin;

public class Honda extends Bike{

	void start() {
		System.out.println("now honda is");
		super.start();
		System.out.println("self start");
	}
	public static void main(String[] args) {
		Honda obj=new Honda();
		obj.start();
	}
}
