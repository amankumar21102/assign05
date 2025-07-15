package com.elemica.supply.chain.assign01;


import java.util.*;


public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> numbers=new ArrayList<Integer>();
	     numbers.add(1);
         numbers.add(-2);
	     numbers.add(100);
	     numbers.add(601);
	     numbers.add(5);
	     
	     //Printing the even numbers
	        
	     numbers.stream().filter(n -> n%2 == 0).forEach(System.out::println);
	        
	     ArrayList<String> names = new ArrayList<String>();
	     names.add("AMAN");
	     names.add("BADIYAR");
	     names.add("KUMAR");
	     names.add("ANIRUDH");
	     names.add("SAJID");
	     names.add("RAM");
	     
	     //Printing the names is reverse sorted order
	     
	     names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	     
	     // Printing the numbers after multiplying it with 3
	     
	     numbers.stream().map(n -> n*3).forEach(System.out::println);
	        

	}

}
