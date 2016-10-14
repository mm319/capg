package com.cpg.cafe;

import org.junit.Assert;
import org.junit.Test;

import com.cpg.cafe.items.CafeItem;
import com.cpg.cafe.items.CheeseSandwich;
import com.cpg.cafe.items.Coffee;
import com.cpg.cafe.items.Cola;
import com.cpg.cafe.items.SteakSandwich;

public class TestPrice {
	@Test
	public void testItemPrice() {
		
		double price;
		
		ItemsToPurchase itemList = new ItemsToPurchase();
		CafeItem cola = new Cola();
		cola.setPrice(50);
		price = itemList.addItem(cola);
		Assert.assertEquals(Double.valueOf(50), Double.valueOf(price));
		
		CafeItem coffee = new Coffee();
		coffee.setPrice(100);
		price = itemList.addItem(coffee);
		Assert.assertEquals(Double.valueOf(100), Double.valueOf(price));
		
		CafeItem cheese = new CheeseSandwich();
		cheese.setPrice(200);
		price = itemList.addItem(cheese);
		Assert.assertEquals(Double.valueOf(200), Double.valueOf(price));
		
		CafeItem steak = new SteakSandwich();
		steak.setPrice(450);
		price = itemList.addItem(steak);
		Assert.assertEquals(Double.valueOf(450), Double.valueOf(price));
		
		Assert.assertEquals(Double.valueOf(800), Double.valueOf(itemList.totalValue()));
	}
}
