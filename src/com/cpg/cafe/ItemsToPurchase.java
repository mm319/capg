package com.cpg.cafe;

import java.util.Hashtable;
import java.util.Set;

import com.cpg.cafe.items.CafeItem;

public class ItemsToPurchase {

	private Hashtable<CafeItem, Integer> items;
	
	public ItemsToPurchase() {
		items = new Hashtable<CafeItem, Integer>();
	}
	
	public double addItem(CafeItem cafeItem) {
		
		Integer amount = items.get(cafeItem);
		amount = (amount == null) ? 1 : amount + 1;
		
		items.put(cafeItem, amount);
		
		return cafeItem.getPrice();
	}
	
	public Integer getItem(CafeItem cafeItem) {
		
		return items.get(cafeItem);
	}
	
	public double totalValue() {
		
		double total = 0;
		
		Set<CafeItem> keys = items.keySet();
			
		for (CafeItem k: keys) {
			
			int amount = items.get(k);
			total += amount*k.getPrice();
		}
		
		return total;
	}
}
