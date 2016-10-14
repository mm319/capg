package com.cpg.cafe;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.Test;

import com.cpg.cafe.items.CafeItem;
import com.cpg.cafe.items.CheeseSandwich;
import com.cpg.cafe.items.Cola;
import com.cpg.cafe.items.SteakSandwich;

public class TestServiceChange {

	@Test
	public void testItemPrice() {
		
		int quantity;
		double price;
		
		ItemsToPurchase itemList = new ItemsToPurchase();
		CafeItem cola = new Cola();
		cola.setPrice(50);
		cola.setType("Cold drink");
		itemList.addItem(cola);
		itemList.addItem(cola);
		
		quantity = itemList.getItem(cola);
		price = itemList.totalValue().getItems().get(cola);
		
		Assert.assertTrue(50 == price);
		Assert.assertTrue(2 == quantity);
		
		CafeItem cheese = new CheeseSandwich();
		cheese.setPrice(100);
		cheese.setType("Cold food");
		itemList.addItem(cheese);

		quantity = itemList.getItem(cheese);
		price = itemList.totalValue().getItems().get(cheese);
		
		Assert.assertTrue(100 == price);
		Assert.assertTrue(1 == quantity);
		
		CafeItem steak = new SteakSandwich();
		steak.setPrice(450);
		steak.setType("Hot food");
		itemList.addItem(steak);
		
		quantity = itemList.getItem(steak);
		price = itemList.totalValue().getItems().get(steak);
		
		Assert.assertTrue(450 == price);
		Assert.assertTrue(1 == quantity);
	}
	
	@Test
	public void testPriceOfAllItems() {
		
		ItemsToPurchase itemList = new ItemsToPurchase();
		CafeItem cola = new Cola();
		cola.setPrice(50);
		cola.setType("Cold drink");
		itemList.addItem(cola);
		
		CafeItem cheese = new CheeseSandwich();
		cheese.setPrice(100);
		cheese.setType("Cold food");
		itemList.addItem(cheese);
		
		CafeItem steak = new SteakSandwich();
		steak.setPrice(450);
		steak.setType("Hot food");
		itemList.addItem(steak);
		
		Assert.assertTrue(600/100 == itemList.totalValue().getTotalPriceofItems());
	}
	
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
		
		CafeItem steak = new SteakSandwich();
		steak.setPrice(450);
		steak.setType("Hot food");
		itemList.addItem(steak);
		
		Assert.assertTrue((600*.2)/100 == itemList.totalValue().getServiceCharge());
	}
	
	@Test
	public void testPay() {
		
		ItemsToPurchase itemList = new ItemsToPurchase();
		CafeItem cola = new Cola();
		cola.setPrice(50);
		cola.setType("Cold drink");
		itemList.addItem(cola);
		
		CafeItem cheese = new CheeseSandwich();
		cheese.setPrice(100);
		cheese.setType("Cold food");
		itemList.addItem(cheese);
		
		CafeItem steak = new SteakSandwich();
		steak.setPrice(450);
		steak.setType("Hot food");
		itemList.addItem(steak);
		
		double totalPrice = (600*1.2)/100;
		
		DecimalFormat df = new DecimalFormat("###.00");

		Assert.assertTrue(df.format(totalPrice).equals(itemList.totalValue().getTotalPrice()));
	}
}
