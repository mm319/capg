package com.cpg.cafe;

import org.junit.Assert;
import org.junit.Test;

import com.cpg.cafe.items.CafeItem;
import com.cpg.cafe.items.CheeseSandwich;
import com.cpg.cafe.items.Coffee;
import com.cpg.cafe.items.Cola;
import com.cpg.cafe.items.SteakSandwich;

public class TestMaximumService {
	
	@Test
	public void testMaximumServiceCharge() {
		
		ItemsToPurchase itemList = new ItemsToPurchase();
		CafeItem cola = new Cola();
		cola.setPrice(50);
		cola.setType("Cold drink");
		
		CafeItem coffee = new Coffee();
		coffee.setPrice(100);
		coffee.setType("Hot drink");
		
		CafeItem cheese = new CheeseSandwich();
		cheese.setPrice(200);
		cheese.setType("Cold food");
		
		CafeItem steak = new SteakSandwich();
		steak.setPrice(450);
		steak.setType("Hot food");
		
		//8*14=112; 112*.2=£22.4; £132
		for (int i=0; i<14; i++) {
			itemList.addItem(cola);
			itemList.addItem(coffee);
			itemList.addItem(cheese);
			itemList.addItem(steak);
		}
		
		Assert.assertTrue("132.00".equals(itemList.totalValue().getTotalPrice()));
	}
		
}
