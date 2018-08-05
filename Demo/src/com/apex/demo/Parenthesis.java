package com.apex.demo;

public class Parenthesis {
	
	
	public static boolean detectCapitalUse(String word) {
		boolean rv = false;
		
		if((word.charAt(0) >= 192 && word.charAt(0) <= 221)||(word.charAt(0) >= 65 && word.charAt(0) <= 90))
		{
			System.out.println("111");
			for(int j=1;j<word.length();j++) {
				if((word.charAt(j) >= 65 && word.charAt(j) <= 90) || (word.charAt(j) >= 192 && word.charAt(j) <= 221) || (word.charAt(j) >= 97 && word.charAt(j) <= 122)|| (word.charAt(j) >= 224 && word.charAt(j) <= 255)) 
				{
					System.out.println(word.charAt(j));
					rv= true;
				}
				else
				{
					rv =  false;
				}
			}
		}
		else {
			for(int i=0;i<word.length();i++) {
				if((word.charAt(i) >= 97 && word.charAt(i) <= 122)|| (word.charAt(i) >= 224 && word.charAt(i) <= 255)) {
					rv= true;
				}
				else {
					rv= false;
				}
			}
		}		
		return rv;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		flag=detectCapitalUse("UsA");
		System.out.println(flag);
	}

}
