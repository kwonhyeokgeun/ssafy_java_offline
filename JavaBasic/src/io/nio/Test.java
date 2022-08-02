package io.nio;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {
		//System.out.println(Charset.defaultCharset());
		
		//파일생성
		{
			Path file = Paths.get("C:"+File.separator + "nio_test"+File.separator +"temp"+File.separator +"test.txt");
			try {
				Files.createFile(file);
				System.out.println("파일 생성!!");
			}catch(FileAlreadyExistsException e){
				System.out.println("해당 파일이 이미 존재!");
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//폴더 생성
		{
			Path folder = Paths.get("C:\\nio_test\\sub");
			try {
				Files.createDirectories(folder);
				System.out.println("폴더 생성!!");
			} catch(FileAlreadyExistsException e) {
				System.out.println("해당 폴터가 이미 존재!");
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//파일삭제
		{
			Path file = Paths.get("C:"+File.separator + "nio_test"+File.separator +"temp"+File.separator +"test.txt");
			try {
				Files.delete(file);
				System.out.println("파일 삭제!!");
			}catch(NoSuchFileException e){
				System.out.println("해당 파일이 없습니다!");
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//폴더 삭제
		{
			Path folder = Paths.get("C:\\nio_test\\sub");
			try {
				Files.delete(folder);
				System.out.println("폴더 삭제!!");
			} catch(NoSuchFileException e) {
				System.out.println("해당 폴터가 없습니다!");
			}
			catch(DirectoryNotEmptyException e) {
				System.out.println("해당 폴터가 비어있지 않습니다.!");
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		//파일 폴더 확인
		{
			Path file = Paths.get("C:\\nio_test\\temp\\test.txt");
			Path folder = Paths.get("C:\\nio_test\\sub");
			
			//존재하는지
			System.out.println(Files.exists(file));   //true
			System.out.println(Files.exists(folder)); //true
			
			//디렉토리인지
			System.out.println(Files.isDirectory(file));  //false
			System.out.println(Files.isDirectory(folder)); //true
			
			//읽기가 가능한지
			System.out.println(Files.isReadable(file));   //true
			System.out.println(Files.isReadable(folder)); //true
		}
		
		//파일 쓰기
		{
			Path file = Paths.get("C:\\nio_test\\temp\\test.txt");
			String content = "안녕하세요!!!";
			
			try { 
				Files.write(file, content.getBytes());  //덮어쓰기
				System.out.println("쓰기 완료");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
