package com.apex.demo;

import java.util.Scanner;

public class HappyNumberIter {
	
	public static boolean isHappy(int n)
	{
		int sum=0;
		int digit=0;
		int square = 0;
		while(sum !=1 ) {
			sum=0;
			while(n > 0) 
			{
				digit= n % 10;
				square = digit * digit;
				sum = sum+square;
				n = n/10;
			}
			n= sum;
			
		}
	
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		boolean temp= isHappy(number);
		if(temp ==true)
			System.out.println("happy");
		else
			System.out.println("not happy");
	}

}
