package com.apex.demo;

import java.util.Scanner;

public class HappyNumber {

	public static int findSum(int num){
        int sum = 0;
        int square=0;
       
        if(num > 9)
        {
            int digit = num%10;
            square = digit*digit;
            sum=sum+square+findSum(num/10);
        }
        
        return sum;
    }
    public static boolean isHappy(int n) {
        
        boolean happy=false;
        int sum = findSum(n);
        
        if(sum == 1) {
            happy = true;
            return happy;
        }
        
        return happy;
        
        
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
