package com.cpg.cafe;

import org.junit.Assert;
import org.junit.Test;

import com.cpg.cafe.items.CafeItem;
import com.cpg.cafe.items.CheeseSandwich;
import com.cpg.cafe.items.Coffee;
import com.cpg.cafe.items.Cola;
import com.cpg.cafe.items.SteakSandwich;

public class TestFoodService {
	
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
		Assert.assertTrue("1.50".equals(itemList.totalValue().getTotalPrice()));
	
		CafeItem cheese = new CheeseSandwich();
		cheese.setPrice(200);
		cheese.setType("Cold food");
		itemList.addItem(cheese);
		
		Assert.assertTrue("3.85".equals(itemList.totalValue().getTotalPrice()));

	}
}
