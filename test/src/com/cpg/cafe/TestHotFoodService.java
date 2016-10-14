package com.cpg.cafe;

import org.junit.Assert;
import org.junit.Test;

import com.cpg.cafe.items.CafeItem;
import com.cpg.cafe.items.CheeseSandwich;
import com.cpg.cafe.items.Coffee;
import com.cpg.cafe.items.Cola;
import com.cpg.cafe.items.SteakSandwich;

public class TestHotFoodService {

	@Test
	public void testServiceCharge() {
		
		ItemsToPurchase itemList = new ItemsToPurchase();
		CafeItem cola = new Cola();
		cola.setPrice(50);
		cola.setType("Cold drink");
		itemList.addItem(cola);
		
		CafeItem cheese = new CheeseSandwich();
		cheese.setPrice(100);
		cheese.setType("Cold food");
		itemList.addItem(cheese);
		Assert.assertEquals(Double.valueOf(165), Double.valueOf(itemList.totalValue()));
	
		CafeItem steak = new SteakSandwich();
		steak.setPrice(450);
		steak.setType("Hot food");
		itemList.addItem(steak);
		
		Assert.assertEquals(Double.valueOf(720), Double.valueOf(itemList.totalValue()));
	}
		
}