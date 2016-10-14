package com.cpg.cafe;

import org.junit.Assert;
import org.junit.Test;

import com.cpg.cafe.items.CafeItem;
import com.cpg.cafe.items.CheeseSandwich;
import com.cpg.cafe.items.Cola;
import com.cpg.cafe.items.SteakSandwich;

public class TestServiceCoins {

	@Test
	public void testServiceChargeRounding() {
		
		ItemsToPurchase itemList = new ItemsToPurchase();
		CafeItem cola = new Cola();
		cola.setPrice(50);
		cola.setType("Cold drink");
		itemList.addItem(cola);
		
		CafeItem cheese = new CheeseSandwich();
		cheese.setPrice(100);
		cheese.setType("Cold food");
		itemList.addItem(cheese);
		Assert.assertTrue("1.65".equals(itemList.totalValue()));
	
		CafeItem steak = new SteakSandwich();
		steak.setPrice(450);
		steak.setType("Hot food");
		itemList.addItem(steak);
		
		String total = itemList.totalValue();
		System.out.println("total: " +total);
		Assert.assertTrue("7.20".equals(total));
	}
}
