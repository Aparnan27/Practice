package com.apex.demo;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am       very very happy";
		String temp[]=str.split("\\s+");
		for(int i=temp.length-1;i>=0;i--)
		{
			System.out.print(temp[i]+" ");
		}
		
		 
	}

}
