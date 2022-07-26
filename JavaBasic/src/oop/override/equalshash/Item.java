package oop.override.equalshash;

import java.util.Objects;

public class Item {
	int itemId;
	String itemNm;
	
	@Override
	public int hashCode() {
		/*int result=17;
		result = 31*result + itemId;
		result = 31*result +itemNm.hashCode();
		return result;*/
		return Objects.hash(itemId, itemNm);
	}
	

	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Item) {
			Item item = (Item)obj;
			if(item.itemId == this.itemId && item.itemNm.equals(item.itemNm))
					return true;
		}
		return false;
	}
}
