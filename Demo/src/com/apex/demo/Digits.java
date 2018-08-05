
package com.apex.demo;
import java.util.Scanner;
class Digits{

	static void printDigits(int userInput)
	{
		
		if(userInput < 10)
		{
			System.out.println(userInput);
			
		}
		else
		{
			int digit = userInput%10;
			System.out.print(digit);
		
			int restNum = userInput/10;
			printDigits(restNum);
		
			
		}
	
	}

	public static void main(String args[])
	{
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		printDigits(number);
		
	}

}