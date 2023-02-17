package com.prowings.OOPs;

public class Test {

	int i;

	public Test(int k) {
		i = k;
	}

	public Test(int k, int m) {
		System.out.println("Hi i am assigning max values");
		if (k > m) {
			i = k;
		} else
			i = m;
	}

	public static void main(String[] arg) {
		Test obj = new Test(10);
		Test obj1 = new Test(12, 50);
		System.out.println(obj.i);
		System.out.println(obj1.i);

	}

}
