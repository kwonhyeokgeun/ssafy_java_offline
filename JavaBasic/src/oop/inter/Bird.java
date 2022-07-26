package oop.inter;

public class Bird extends Animal implements Fly {

	@Override
	public void howToFly() {
		System.out.println("By wing Fly");
		
	}

	@Override
	public void howFastFly() {
		System.out.println("50 km/h Fly");
	}

}
