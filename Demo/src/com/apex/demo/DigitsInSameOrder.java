package com.apex.demo;

import java.util.Scanner;
import java.lang.*;

public class DigitsInSameOrder {
	
	static void printDigitsInSameOrder(int num,int div)
	{
		if(num < 10)
			System.out.println(num);
		else
		{
			int digit = num/div;
			System.out.println(digit);
			num = num % div;
			div = div/10;
			printDigitsInSameOrder(num,div);
		}
	}

	static int findDivisor(int number)
	{
	
		int x = 1;
		int div=1;
		int quotient=number;
		while(quotient > 9)
		{
			div=div*10;
			quotient = number/div;
			x++;
		}
		return div;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		int divisor = findDivisor(number);
		printDigitsInSameOrder(number,divisor);
		
	}

}