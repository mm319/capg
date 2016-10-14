package com.cpg.cafe;

import java.util.Hashtable;

import com.cpg.cafe.items.CafeItem;

public class ServiceChange {

	private Hashtable<CafeItem, Double> items = new Hashtable<CafeItem, Double>();
	private double totalPriceofItems = 0;
	private double serviceCharge = 0;
	private String totalPrice = "";
	
	public Hashtable<CafeItem, Double> getItems() {
		return items;
	}
	public void setItems(Hashtable<CafeItem, Double> items) {
		this.items = items;
	}
	public double getTotalPriceofItems() {
		return totalPriceofItems;
	}
	public void setTotalPriceofItems(double totalPriceofItems) {
		this.totalPriceofItems = totalPriceofItems;
	}
	public double getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
