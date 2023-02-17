package com.prowings.OOPs;

public class Child extends Base {

	@Override
	void method(double a) {
		// TODO Auto-generated method stub
		super.method(a);
		System.out.println("child class method called with double" + a);

	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.method(10.20);
//		obj.method(20);
	}

}
