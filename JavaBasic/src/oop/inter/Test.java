package oop.inter;

public class Test {
	public static void main(String[] args) {
		{
			Animal bird = new Bird();
			bird.eat(); //본질적인 is a 관계 메소드
			//bird.howFastFly(); //에러임
		}
		{
			Fly bird = new Bird();
			//bird.eat() //에러임
			bird.howFastFly();
		}
		{
			Fly fly1 = getInstance("dove");
			fly1.howFastFly();
			
			Fly fly2 = getInstance("airplane");
			fly2.howFastFly();
		}
	}
	static Fly getInstance(String name) {
		switch(name) {
			case "dove" : return new Dove();
			case "airplane" : return new Airplane();
			default : return new Bird();
		}
	}
}
