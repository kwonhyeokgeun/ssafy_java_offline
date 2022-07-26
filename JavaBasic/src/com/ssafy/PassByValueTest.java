package com.ssafy;

public class PassByValueTest {

	public static void main(String[] args) {
		int i=3;
		setVal(i);
		System.out.println(i);
	
		Pass p =new Pass();
		p.val=10;
		setVal(p);
		System.out.println(p.val);
	}
	public static void setVal(int i) {i=5;}
	public static void setVal(Pass p) {p.val=5;}
}

class Pass{
	public int val = 3;
}
