package com.apex.demo;

public class ReverseInteger {
	public static int reverse(int x) {
        int reverse =0;
        int number =0;
        
        if(x==0)
            return 0;
      
        while (x!=0 ){
        //	int remainder = x%10;
        	number = number*10;
        	
        	if(number >= Integer.MAX_VALUE) {
            	System.out.println("here");
            	return 0;
            }
            reverse = number+x%10;
            
            x = x/10;
        }
        return reverse;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res=reverse(1534236469);
		System.out.println(res);
	}

}
