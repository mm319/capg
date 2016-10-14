package com.cpg.cafe;

import org.junit.Assert;
import org.junit.Test;

import com.cpg.cafe.items.CafeItem;
import com.cpg.cafe.items.Coffee;
import com.cpg.cafe.items.Cola;
import com.cpg.cafe.items.SteakSandwich;

public class TestService {
	
	@Test
	public void testServiceCharge() {
		
		
		ItemsToPurchase itemList = new ItemsToPurchase();
		CafeItem cola = new Cola();
		cola.setPrice(50);
		cola.setType("Cold drink");
		itemList.addItem(cola);
		
		CafeItem coffee = new Coffee();
		coffee.setPrice(100);
		coffee.setType("Hot drink");
		itemList.addItem(coffee);
		Assert.assertEquals(Double.valueOf(1.50), Double.valueOf(itemList.totalValue().getTotalPrice()));
	
		CafeItem steak = new SteakSandwich();
		steak.setPrice(450);
		steak.setType("Hot food");
		itemList.addItem(steak);
		
		Assert.assertEquals(Double.valueOf(7.20), Double.valueOf(itemList.totalValue().getTotalPrice()));
	
	}
}
