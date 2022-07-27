package collection.map;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("love", "����ϴ�");
		map.put("hate", "�Ⱦ��ϴ�");
		map.put("same", "�Ȱ���");
		System.out.println(map.get("same")); //�Ȱ���
		
		map.put("love", "����ϴ�2");
		System.out.println(map.get("love")); //����ϴ�2 ��� //����� ��
		
		System.out.println(map.keySet()); //[love, same, hate]   //Ű ����
		System.out.println(map.values());  //[����ϴ�2, �Ȱ���, �Ⱦ��ϴ�]  //��� ����
	}

}
