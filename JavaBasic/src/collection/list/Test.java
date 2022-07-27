package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		{
			ArrayList al = new ArrayList(); //타입 부재
		}
		{
			ArrayList<String> al2 = new ArrayList<>(); //비추천
			List<String> al = new ArrayList<>(); //이게 일반적
			al.add("손흥민");
			al.add("이강인");
			al.add("이승우");
			System.out.println(al);
			
			al.add("이강인");  //중복가능
			System.out.println(al);
			
			al.remove(0); //0번째 제거
			System.out.println(al);
			
			al.remove("이강인");  //값이 이강인 인거 앞에거 제거
			System.out.println(al);
			
			al.remove("이승우");
			System.out.println(al);
			
			al.remove("이승우");  //없는 값 제거 //에러 안남
			System.out.println(al);  //변화 없음
		
		}
		{//순회
			List<String> al = new ArrayList<>(); //이게 일반적
			al.add("손흥민");
			al.add("이강인");
			al.add("이승우");
			al.add("이강인");
			
			for(int i=0; i<al.size(); i++) {
				String s = al.get(i);
				System.out.print(s+" ");
			}System.out.println();
			
			for(String s : al) {
				System.out.print(s+" ");
			}System.out.println();
			
			Iterator<String> it = al.iterator();
			while(it.hasNext()) {
				String s =it.next();
				System.out.print(s+" ");
			}System.out.println();
		}
		{
			List<String> al = new ArrayList<>(); 
			al.add("손흥민");
			al.add("이강인");
			al.add("이강인");
			al.add("이승우");
			
			for(int i=al.size()-1; i>=0;i--) {  //삭제는 뒤부터하기 
				String s = al.get(i);
				if(s.equals("이강인")) al.remove(i);
			}
			System.out.println(al);
		}
		{
			List<String> al = new ArrayList<>(); //이게 일반적
			al.add("손흥민");
			al.add("이강인");
			al.add("이강인");
			al.add("이승우");
			
			//앞에서부터 삭제 하려면 이터레이터.remove()
			Iterator<String> it = al.iterator();
			while(it.hasNext()) {
				String s =it.next();
				if(s.equals("이강인")) it.remove(); //al.remove가 아닌 이터.remove();
			}
			System.out.println(al);
		}
		
		{
			List<String> books = new ArrayList<>();
			books.add("a");
			books.add("b");
			String[] result = new String[books.size()];
			books.toArray(result);
			System.out.println(Arrays.toString(result));
		}
		
		{
			List<String> al = new ArrayList<>();
			al.add("이승우");
			al.add("이강인");
			al.add("손흥민");
			al.add("이강인");
			System.out.println(al);
			Collections.sort(al);		
			System.out.println(al);
			
		}
	}
	
}
