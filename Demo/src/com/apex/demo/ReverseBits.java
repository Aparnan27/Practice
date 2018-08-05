package com.apex.demo;
import java.util.Scanner;
public class ReverseBits {
	
	public static void reverseBits(int n) {
		 int pow=1;
	        int num=0;
	        int bin[]= new int[32];
	        int i=0;
	        
	        while(n > 0){
	            bin[i]=n%2;
	            n=n/2;
	            i++;
	        }
	        
	       for(int j=bin.length-1;j>=0;j--)
	       {
	    	   num=num+bin[j]*pow;
	    	   pow=pow*2;
	       }
	       System.out.println(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = input.nextInt();
		input.close();
		reverseBits(num);
		
	}

}
