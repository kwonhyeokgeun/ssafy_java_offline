package oop.poly.abstactt;

public class OS {
	void print() {
		System.out.println("Print....");
	}
	void print(Printer p) {
		p.print();
	}
}
