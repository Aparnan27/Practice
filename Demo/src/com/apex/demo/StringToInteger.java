package com.apex.demo;

public class StringToInteger {
	
	static void strToInt(String num1,String num2) {
		boolean neg1=false;
        boolean neg2=false;
     //   long number1 =0;
      //  long number2 =0;
        int i=0,j=0;
        int len1=num1.length();
        int len2=num2.length();
       
        int number1[] = new int[len1];
        int number2[] = new int[len2];
        
        if(num1.charAt(0)=='-'){
            neg1=true;
            i++;
        }
        if(num2.charAt(0)=='-'){
            neg2=true;
            j++;
        }
        while(i<len1){
        //	System.out.println("111");
            number1[i] = number1[i]*10;
            number1[i] = number1[i]+(num1.charAt(i)-'0');
            i++;
        }
       while(j<len2){
        	
            number2[j] = number2[j]*10;
            number2[j] = number2[j]+(num2.charAt(j)-'0');
            j++;
        }
       
      
      System.out.println("number1:"+number1);
      System.out.println("number2:"+number2);
      /*  if(neg1 == true)
            number1=-number1;
        if(neg2 == true)
            number2 = -number2;*/
        
       // long res=number1+number2;
       // return Long.toString(res);
        
       
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  strToInt("6913259244","71103343");
		//System.out.println(result);
	}

}
