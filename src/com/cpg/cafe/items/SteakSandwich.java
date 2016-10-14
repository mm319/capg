package com.cpg.cafe.items;

public class SteakSandwich implements CafeItem {

	private double price;
	private String type;

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getType() {
		return type;
	}
}
