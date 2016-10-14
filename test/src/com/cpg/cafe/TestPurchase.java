package com.cpg.cafe;

import org.junit.Assert;
import org.junit.Test;

import com.cpg.cafe.items.CafeItem;
import com.cpg.cafe.items.CheeseSandwich;
import com.cpg.cafe.items.Coffee;
import com.cpg.cafe.items.Cola;
import com.cpg.cafe.items.SteakSandwich;

public class TestPurchase {

	@Test
	public void testPurchaseRequest() {
		
		ItemsToPurchase itemList = new ItemsToPurchase();
		CafeItem cola = new Cola();
		itemList.addItem(cola);
		Assert.assertEquals(Long.valueOf(1), Long.valueOf(itemList.getItem(cola)));
		
		itemList.addItem(cola);
		Assert.assertEquals(Long.valueOf(2), Long.valueOf(itemList.getItem(cola)));
		
		CafeItem coffee = new Coffee();
		itemList.addItem(coffee);
		Assert.assertEquals(Long.valueOf(1), Long.valueOf(itemList.getItem(coffee)));
		
		itemList.addItem(coffee);
		Assert.assertEquals(Long.valueOf(2), Long.valueOf(itemList.getItem(coffee)));
		
		CafeItem cheese = new CheeseSandwich();
		itemList.addItem(cheese);
		Assert.assertEquals(Long.valueOf(1), Long.valueOf(itemList.getItem(cheese)));
		
		itemList.addItem(cheese);
		Assert.assertEquals(Long.valueOf(2), Long.valueOf(itemList.getItem(cheese)));
		
		CafeItem steak = new SteakSandwich();
		itemList.addItem(steak);
		Assert.assertEquals(Long.valueOf(1), Long.valueOf(itemList.getItem(steak)));
		
		itemList.addItem(steak);
		Assert.assertEquals(Long.valueOf(2), Long.valueOf(itemList.getItem(steak)));
	}
}
