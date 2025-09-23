package com.tnsif.string;

public class StringDemo {

	public static void main(String[] args) {
		String x = "hello";
		String y = "hello";
		
		System.out.println(x.equals(y));
		System.out.println(x==y);
		
		String s = new String("hello");
		
		System.out.println(x.equals(s));
		System.out.println(x==s);
	}

}
//23-09-2025
//Because of x and y are String Literals so (x==y) is true where it come to s , s is a object so when ever we compare x and s it will give false
