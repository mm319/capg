package com.cpg.cafe;

import java.text.DecimalFormat;
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
	
	public ServiceChange totalValue() {
		
		double total = 0;
		double serviceCharge = 0;
		boolean foodItem = false;
		boolean hotFood = false;
		
		ServiceChange sc = new ServiceChange();
		
		
		Set<CafeItem> keys = items.keySet();
		Hashtable<CafeItem, Double> itemPrice = new Hashtable<CafeItem, Double>();
			
		for (CafeItem k: keys) {
			
			if (k.getType().toLowerCase().contains("food")) 
				foodItem = true;
			
			if (k.getType().toLowerCase().contains("hot food")) 
				hotFood = true;
			
			int amount = items.get(k);
			total += amount*k.getPrice();
			
			itemPrice.put(k, k.getPrice());
		}
		
		if (foodItem && !hotFood) {
			serviceCharge = total*.1;
		}
		
		if (hotFood) {
			serviceCharge = total*.2;
		}
		
		if (serviceCharge > 2000)
			serviceCharge = 2000;
		
		sc.setItems(itemPrice);
		sc.setTotalPriceofItems(total/100);
		sc.setServiceCharge(serviceCharge/100);
		
		total += serviceCharge; 
		DecimalFormat df = new DecimalFormat("###.00");
		
		sc.setTotalPrice(df.format(total/100).toString());
		
		return sc;
	}
}
