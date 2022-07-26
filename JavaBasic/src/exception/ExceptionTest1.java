package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest1 {

	public static void main(String[] args) throws Exception{
		//FileInputStream fis = new FileInputStream("hello.txt");
		
		/*
		//hello.txt 파일을 읽고 싶다.
		try {
			FileInputStream fis = new FileInputStream("hello.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Exception : "+e.getMessage());
			e.printStackTrace();
		}*/
		

		
		/*
		try {
			System.out.println("try1");
			Class.forName("java.lang.Object");
			System.out.println("try2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return;
		}finally {
			System.out.println("finally!!");
		}
		System.out.println("end!!");*/

		/*
		//Hello라는 클래스 찾기		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("hello.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
		
		
		try (FileInputStream fis = new FileInputStream("hello.txt");){
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
