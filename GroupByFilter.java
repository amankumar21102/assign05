package com.elemica.supply.chain.assign01;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Item> items = new ArrayList<>();
        items.add(new Item("Laptop", 1500, "Electronics"));
        items.add(new Item("Phone", 800, "Electronics"));
        items.add(new Item("Shirt", 50, "Clothing"));
        items.add(new Item("TV", 1200, "Electronics"));
        items.add(new Item("Jeans", 70, "Clothing"));

        // Filter price > 1000
        items.stream()
             .filter(i -> i.getPrice() > 1000)
             .forEach(i -> System.out.println(i.getName()));

        // Group by category
        Map<String, List<Item>> byCategory = items.stream()
             .collect(Collectors.groupingBy(Item::getCategory));
        System.out.println("Grouped by Category: " + byCategory);

        // Count per category
        Map<String, Long> countByCategory = items.stream()
             .collect(Collectors.groupingBy(Item::getCategory, Collectors.counting()));
        System.out.println("Count by Category: " + countByCategory);

        // Max price
        Item maxPriceItem = items.stream()
             .max(Comparator.comparing(Item::getPrice))
             .orElse(null);
        System.out.println("Max Price Item: " + (maxPriceItem != null ? maxPriceItem.getName() : "None"));
    }
}
