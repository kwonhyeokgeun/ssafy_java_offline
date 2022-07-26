package com.ssafy;

public class HumanTest {
	public static void main(String[] args) {
		//에러인 번호와 에러 이름은?
		Human p1=new Human(); //1번
		Human p2=new Human("mike"); //2번
		Human p3=new Human("mike",20); //3번
		Human p4=new Human("mike",20,true); //4번
	}
}
