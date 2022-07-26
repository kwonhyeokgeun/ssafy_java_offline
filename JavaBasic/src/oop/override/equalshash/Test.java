package oop.override.equalshash;

public class Test {

	public static void main(String[] args) {
		Item item1 = new Item();
		item1.itemId=1;
		item1.itemNm="item";
		
		Item item2 = new Item();
		item2.itemId=1;
		item2.itemNm="item";
		
		if(item1 == item2) {
			System.out.println("same!!");
		}else {
			System.out.println("not same!!");
		}
		
		if(item1.equals( item2)) {
			System.out.println("same!!");
		}else {
			System.out.println("not same!!");
		}
		
	}

}
