package com.tnsif.exceptions;

class Sample{
	int a=10,b=0;
	int c=a/b;
    public void show() {
    	System.out.println(this.c);
    }
	
}

public class UncheckedException {

	public static void main(String[] args) {
		Sample s=new Sample();
		s.show();

	}

}
