package com.cpg.cafe;

import java.util.Hashtable;

import com.cpg.cafe.items.CafeItem;

public class ItemsToPurchase {

	private Hashtable<CafeItem, Integer> items;
	
	public ItemsToPurchase() {
		items = new Hashtable<CafeItem, Integer>();
	}
	
	public void addItem(CafeItem cafeItem) {
		
		Integer amount = items.get(cafeItem);
		amount = (amount == null) ? 1 : amount + 1;
		
		items.put(cafeItem, amount);
	}
	
	public Integer getItem(CafeItem cafeItem) {
		
		return items.get(cafeItem);
	}
}
