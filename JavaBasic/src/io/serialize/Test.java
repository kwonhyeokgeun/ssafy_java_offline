package io.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.n = 10;
		mc.str = "hello";
	
		write(mc); //쓰기
		
		//write만 먼저 실행하고 read를 해야 에러 안남
		MyClass mc2 = read();  //읽기
		System.out.println(mc2.n); //10 
		System.out.println(mc2.str); //hello
	}
	
	static void write(MyClass mc) {
		//ObjectOutputStream, ObjectInputStream,
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("MyClass.dat"));){
			oos.writeObject(mc);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	static MyClass read() {
		//ObjectOutputStream, ObjectInputStream,
		MyClass mc = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("MyClass.dat"));){
			mc = (MyClass)ois.readObject();
		}catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return mc;
	}
}
