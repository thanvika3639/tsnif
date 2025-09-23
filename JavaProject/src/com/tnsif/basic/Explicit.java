package com.tnsif.basic;

public class Explicit
{

	public static void main(String[] args) 
	{
		double d = 99.99;   
		int i = (int) d;   

		int x = 130;
		byte b = (byte) x;  

		System.out.println("Double value: " + d);
		System.out.println("After casting double to int: " + i);
		System.out.println("Int value: " + x);
	    System.out.println("After casting int to byte: " + b);
		    
	}
}

