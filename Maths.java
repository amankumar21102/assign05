package com.elemica.supply.chain.assign01;

public class Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    MathOperation add = (a, b) -> a + b;
	        MathOperation subtract = (a, b) -> a - b;
	        MathOperation multiply = (a, b) -> a * b;
		   int a=96,b=104;
	        System.out.println("Add: " + add.operate(a, b));
	        System.out.println("Subtract: " + subtract.operate(a, b));
	        System.out.println("Multiply: " + multiply.operate(a, b));
	       


	}

}
