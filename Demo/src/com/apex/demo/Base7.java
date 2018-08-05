package com.apex.demo;

public class Base7 {
	
	static String convertToBase7(int num) {
		int base7[]= new int[50];
        int number=0;
        int neg=0;
        String numStr ="";
        int i=0;
        
        if(num == 0) {
        	return "0";
        }
        while(num > 0 || num < 0){
            base7[i] = num%7;
            num = num/7;
            i++;
        }
        
        for(int j=base7.length-1 ; j>=0 ; j--){
            number = number * 10;
            number = number + base7[j];
        }
        
        
        if(number < 0) {
        	number = -number;
        	neg=1;
        }
        
       /* while(number > 0 ) {
        	numStr = (char)(number%10+'0')+numStr;
        	number = number/10;
        	
        }*/
        if(neg == 1) {
        	return '-'+String.valueOf(number);
        }
        
        
        return String.valueOf(number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = convertToBase7(-500);
		System.out.println(res);
	}

}
