package collection.map;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("love", "사랑하다");
		map.put("hate", "싫어하다");
		map.put("same", "똑같다");
		System.out.println(map.get("same")); //똑같다
		
		map.put("love", "사랑하다2");
		System.out.println(map.get("love")); //사랑하다2 출력 //덮어쓰기 됨
		
		System.out.println(map.keySet()); //[love, same, hate]   //키 집합
		System.out.println(map.values());  //[사랑하다2, 똑같다, 싫어하다]  //밸류 집합
	}

}
