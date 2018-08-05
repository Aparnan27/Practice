package com.apex.demo;
import java.util.Scanner;

public class Power2 {
	
	public static boolean isPowerOf(int n) {
		 if(n == 1)
	            return true;
	        
	        if(n <= 0)
	            return false;
	        
	        while(n !=1)
	        {
	            if(n%3 != 0)
	                return false;
	            n=n/3;
	        }
	        return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int num = input.nextInt();
		input.close();
		System.out.println(isPowerOf(num));
	}

}
