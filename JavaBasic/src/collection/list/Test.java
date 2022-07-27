package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		{
			ArrayList al = new ArrayList(); //Ÿ�� ����
		}
		{
			ArrayList<String> al2 = new ArrayList<>(); //����õ
			List<String> al = new ArrayList<>(); //�̰� �Ϲ���
			al.add("�����");
			al.add("�̰���");
			al.add("�̽¿�");
			System.out.println(al);
			
			al.add("�̰���");  //�ߺ�����
			System.out.println(al);
			
			al.remove(0); //0��° ����
			System.out.println(al);
			
			al.remove("�̰���");  //���� �̰��� �ΰ� �տ��� ����
			System.out.println(al);
			
			al.remove("�̽¿�");
			System.out.println(al);
			
			al.remove("�̽¿�");  //���� �� ���� //���� �ȳ�
			System.out.println(al);  //��ȭ ����
		
		}
		{//��ȸ
			List<String> al = new ArrayList<>(); //�̰� �Ϲ���
			al.add("�����");
			al.add("�̰���");
			al.add("�̽¿�");
			al.add("�̰���");
			
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
			al.add("�����");
			al.add("�̰���");
			al.add("�̰���");
			al.add("�̽¿�");
			
			for(int i=al.size()-1; i>=0;i--) {  //������ �ں����ϱ� 
				String s = al.get(i);
				if(s.equals("�̰���")) al.remove(i);
			}
			System.out.println(al);
		}
		{
			List<String> al = new ArrayList<>(); //�̰� �Ϲ���
			al.add("�����");
			al.add("�̰���");
			al.add("�̰���");
			al.add("�̽¿�");
			
			//�տ������� ���� �Ϸ��� ���ͷ�����.remove()
			Iterator<String> it = al.iterator();
			while(it.hasNext()) {
				String s =it.next();
				if(s.equals("�̰���")) it.remove(); //al.remove�� �ƴ� ����.remove();
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
			al.add("�̽¿�");
			al.add("�̰���");
			al.add("�����");
			al.add("�̰���");
			System.out.println(al);
			Collections.sort(al);		
			System.out.println(al);
			
		}
	}
	
}
