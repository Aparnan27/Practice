package com.apex.demo;

import java.util.Scanner;

public class IterDigits {
	
	static void printIterDigits(int userInput)
	{
		int len=String.valueOf(userInput).length();
	
		int digits_arr[];
		digits_arr=new int[len];
		int i=0;
		
		while(userInput != 0)
		{
			int digit = userInput%10;
			digits_arr[i]=digit;
			i++;
			userInput = userInput/10;
		}
		int arrLen = digits_arr.length;
		
		System.out.println("Entered digits are:");
		for(int j=arrLen-1;j>=0;j--)
		{
			System.out.println(digits_arr[j]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		printIterDigits(number);

	}

}
