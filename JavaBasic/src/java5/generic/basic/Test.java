package java5.generic.basic;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		ObjectContainer oc = new ObjectContainer();
		oc.setElement("String");
		String str = (String) oc.getElement(); //Ÿ���� �˰��ִ� ���
		if(oc.getElement() instanceof String) { //Ÿ���� �𸣴� ���
			String str2 = (String) oc.getElement();
		}
		
		StringContainer sc = new StringContainer(); //�Ѱ��� Ÿ�Ը� ���� ���
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
