package java5.generic.basic;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		ObjectContainer oc = new ObjectContainer();
		oc.setElement("String");
		String str = (String) oc.getElement(); //타입을 알고있는 경우
		if(oc.getElement() instanceof String) { //타입을 모르는 경우
			String str2 = (String) oc.getElement();
		}
		
		StringContainer sc = new StringContainer(); //한가지 타입만 쓰는 경우
		sc.setElement("String");
		String str3 = sc.getElement();
		
		GenericContainer<String> gc = new GenericContainer<>();
		gc.setElelment("String");
		String str4 = gc.getElelment();
		
		GenericContainer<Integer> gc2 = new GenericContainer<>();
		gc2.setElelment(10);
		int n1 = gc2.getElelment();
		
		List<Integer> lst = new ArrayList<>();
		
		
	}

}
