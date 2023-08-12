package com.test.dynamicprograming;

public class FibonacciValue {
	static int pp=0,p=1,c=1, target =7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int result = fib(target);
    System.out.println("000 "+result);
	}
	private static int fib(int target) {
		// TODO Auto-generated method stub
		if(target ==0) {
			return 0;
		}else if(target ==1 || target == 2) {
			return 1;
		}else {
			c =pp+p;
			pp=p;
			p=c;
			fib(target-1);
			return c;
		}
	}

}
