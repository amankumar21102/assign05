package com.elemica.supply.chain.assign01;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String > names = Optional.of("Virat");
		names.ifPresent(str -> System.out.println(str.toUpperCase()));
		
		

	}

}
