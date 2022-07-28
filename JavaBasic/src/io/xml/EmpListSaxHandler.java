package io.xml;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class EmpListSaxHandler extends DefaultHandler{
	private List<Emp> empList = new ArrayList<>();
	private Emp emp;
	private String data;
	
	public void startElement (String uri, String localName, String qName, Attributes attributes) throws SAXException{
		if(qName.equals("emp")) {//시작태그가 emp인 경우
			emp = new Emp(); //객체 생성
		}
	}
	public void endElement (String uri, String localName, String qName) throws SAXException{
		switch(qName) {
		case "emp-id" : emp.setEmpId(data); break; //characters()에서 data에 값을 넣어놨음
		case "emp-nm" : emp.setEmpNm(data); break;
		case "salary" : emp.setSalary(Integer.parseInt(data)); break;  //string을 int형으로 변환
		case "enter-dt" : emp.setEnterDt(LocalDate.parse( data)); break;
		case "emp" : empList.add(emp); break; //emp태그가 오면 기존의 emp를 리스트에 넣음
		}
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		this.data = new String(ch, start, length); //ch배열을 start부터 length까지 string으로 만들어 넣음
	}
	
	public List<Emp> getEmpList(){
		return this.empList;
	}
}
