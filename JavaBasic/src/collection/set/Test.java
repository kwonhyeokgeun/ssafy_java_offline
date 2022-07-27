package collection.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		{
			Set<String> set = new HashSet<>();
			set.add("Hello");
			set.add("world");
			set.add("Hello");
			set.add("ssafy");
			set.add(new String("ssafy"));
			System.out.println(set);  //[world, Hello, ssafy]
			
		}
		
		{
			Set<MyClass> set = new HashSet<>();
			set.add(new MyClass(7,3,3));
			set.add(new MyClass(2,4,3));
			set.add(new MyClass(7,3,3));
			System.out.println(set);
		}
		
	}
	static class MyClass{
		int x,y,c;
		
		public MyClass(int y, int x, int c) {
			this.y=y;
			this.x=x;
			this.c=c;
		}

		public String toString() {
			return "[x=" + x + ", y=" + y + ", c=" + c + "]";
		}

		@Override
		public boolean equals(Object obj) {
			if(obj!=null && obj instanceof MyClass) {
				MyClass mc = (MyClass)obj;
				if(mc.x==this.x && mc.y==this.y && mc.c==this.c) return true;
			}
			return false;
		}
		
		public int hashCode() {
			return Objects.hash(this.y, this.x, this.c);
		}
	}
}
