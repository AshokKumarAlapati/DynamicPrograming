package com.test.dynamicprograming;

public class FibonacciSeries {

	static int pp=0,p=1,c=1, length =5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.print(pp+" "+p);
    fib(length-2);
	}
	private static void fib(int length) {
		if(length >0) {
			c =pp +p;
			pp =p;
			p =c;
			System.out.print(" "+c);
			fib(length-1);
		}
		
	}

}
