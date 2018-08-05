package com.apex.demo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter you choice");
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		
		
		
		switch(userInput) {
		case 1: System.out.println("You entered 1");break;
		case 2: System.out.println("You enetered 2");break;
		default : System.out.println("invalid");break;
		}
		input.close();
	}
	

}
