package com.test.dynamicprograming;

public class FibonacciValueWithDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int target =3;
      String mem[] = new String[target+1];
      int result = fib(target, mem);
      System.out.println("result is "+result);
	}

	private static int fib(int target, String[] mem) {
		// TODO Auto-generated method stub
		System.out.println("abc");
		int result =0;
		if(mem[target]!= null) {
			return Integer.parseInt(mem[target]);
		}
		if(target ==1 || target ==2) {
			result =1;
		}else {
			result = fib(target-1, mem)+fib(target-2, mem);
		}
		mem[target] = String.valueOf(result);
		return result;
	}

}
