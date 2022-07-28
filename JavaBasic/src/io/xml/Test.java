package io.xml;

import java.io.File;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Test {
	public static void main(String[] args) throws Exception {
		//File file = new File("emp-list.xml"); //같은 디렉토리일때는 이렇게 가능
		File file = new File("C:/Users/samsung/eclipse-workspace/ssafy_java_offline/JavaBasic/src/io/xml/emp-list.xml");
		EmpListSaxHandler handler = new EmpListSaxHandler();
		
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		//saxParser는 xml파일과 그 파일을 처리할 handler를 입력받음
		saxParser.parse(file, handler);  //xml 문서를 읽으면서 시작 태그, 종료 태그, 택스트 노드를 만나면 전달된 handler의 해당 메소드를 호출해 준다.
		
		List<Emp> empList = handler.getEmpList();
		for(Emp emp : empList) {
			System.out.println(emp);
		}
		
	}
}
