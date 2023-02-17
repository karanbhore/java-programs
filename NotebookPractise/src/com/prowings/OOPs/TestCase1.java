package com.prowings.OOPs;

public class TestCase1 {

//	void m1(Integer i) {
//		System.out.println("inside m1 accepting Integer i "+i);
//	}
//	void m1(Integer l) {
//		System.out.println("inside m1 accepting Integer ");
//	}
//	void m1(int l,int i) {
//		System.out.println("inside m1 accepting 2");
//	}
	void m1(Number n,int i) {
		System.out.println("inside m1 accepting Number");
	}
//	void m1(int i,Number n) {
//		System.out.println("inside m1 accepting Number");
//	}
//	void m1(int i) {
//		System.out.println("inside m1 accepting int i "+i);
//	}
	public static void main(String[] args) {
		TestCase1 obj=new TestCase1();
//		Integer i=45;
		obj.m1(45,45); 
		
//		Integer j=2;
//		int i=4;
//		long l=2;
//		l=i;
//		
//		System.out.println(l);
	}
	
	
}
