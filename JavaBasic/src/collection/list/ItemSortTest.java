package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ItemSortTest {

	public static void main(String[] args) {
		{
			//ArrayList<Item> al = new ArrayList<Item>();
			List<Item> al = new ArrayList<Item>();
			al.add(new Item(1,"item1"));
			al.add(new Item(3,"item3"));
			al.add(new Item(2,"item3"));
			al.add(new Item(2,"item2"));
			System.out.println(al);
			
			Collections.sort(al, (o1,o2)->o1.itemId == o2.itemId ? o1.itemNm.compareTo(o2.itemNm) : o1.itemId - o2.itemId);
			System.out.println(al);
		}
	}
//	static class ComparatorImpl implements Comparator<Item>{
//
//		@Override
//		public int compare(Item o1, Item o2) {
//			
//			return o1.itemId == o2.itemId ? o1.itemNm.compareTo(o2.itemNm) : o1.itemId - o2.itemId;
//		}
//		
//	}
	static class Item {//implements Comparable<Item>
		int itemId;
		String itemNm;
		
		public Item(int itemId, String itemNm) {
			this.itemId = itemId;
			this.itemNm = itemNm;
			
		}

		@Override
		public String toString() {
			return "[itemId=" + itemId + ", itemNm=" + itemNm + "]";
		}
		
		public boolean equals(Object o) {
			if(o!=null && o instanceof Item) {
				Item item = (Item) o;
				if(this.itemId == item.itemId && this.itemNm.equals(item.itemNm))
					return true;
			}
			return false;
		}
		/*
		@Override
		public int compareTo(Item o) {
			//itemId로만 오름차순 정렬
			return this.itemId - o.itemId;
		}*/
		
//		@Override
//		public int compareTo(Item o) {
//			//itemId, itemNm 기준 오름차순 정렬
//			return this.itemId == o.itemId ? this.itemNm.compareTo(o.itemNm) : this.itemId - o.itemId;		
//		}
	}
}
