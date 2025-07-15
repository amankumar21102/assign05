package com.elemica.supply.chain.assign01;
import java.util.*;
import java.util.function.Predicate;
public class PrintingWithReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> places = new ArrayList<String>();
		places.add("Hyderabad");
		places.add("Gaya");
		places.add("Mumbai");
		places.add("patna");
		places.forEach(System.out::println);
		
		Predicate<Integer> isEven = (i) -> i%2==0;
		
		System.out.println(isEven.test(0));
		
		

	}

}
