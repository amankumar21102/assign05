package com.elemica.supply.chain.assign01;

public class Item {
	 String name;
	    double price;
	    String category;

	    Item(String name, double price, String category) {
	        this.name = name;
	        this.price = price;
	        this.category = category;
	    }

	    public String getName() { return name; }
	    public double getPrice() { return price; }
	    public String getCategory() { return category; }

}
