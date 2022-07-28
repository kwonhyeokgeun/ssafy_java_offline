package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class CSVTest {

	public static void main(String[] args) throws IOException {
		List<Emp> empList = new ArrayList<>();
		empList.add(new Emp("111","홍길동",40000));
		empList.add(new Emp("222","이길동",20000));
		empList.add(new Emp("333","삼길동",30000));
		empList.add(new Emp("444","사길동",40000));
		empList.add(new Emp("555","오길동",50000));
		
		
		//csv 파일 생성
		String filePath = "c:" +File.separator +"SSAFY";
		String fileName = "empList.csv";
		
		File file = new File(filePath);
		if(!file.exists() ) { //해당 경로가 없으면
			file.mkdir(); //생성해라
		}
		
		try(FileOutputStream fos = new FileOutputStream(filePath + File.separator + fileName);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter br = new BufferedWriter(osw);) {  //AutoCloseable을 implements하므로 try-resource를 사용
			
			for(Emp emp : empList) {
				//구분자 default는 , 인데 대신 ^를 쓰겠다.
				br.write(emp.getEmpId() + "^" + emp.getEmpNm() + "^" + emp.getSalary());
				br.newLine();
			}
			br.flush(); //버퍼를 비워줌
			System.out.println("파일이 생성되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
class Emp{
	private String empId;
	private String empNm;
	private int salary;
	
	public Emp(){}
	public Emp(String empId, String empNm, int salary) {
		super();
		this.empId = empId;
		this.empNm = empNm;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empNm=" + empNm + ", salary=" + salary + "]";
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
