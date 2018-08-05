package com.apex.demo;

public class LenghtLastWord {
	public static int lengthOfLastWord(String s) {
		
		int len = 0;

		/* String a is 'final'-- can not be modified
		So, create a copy and trim the spaces from
		both sides */
		String x = s.trim();
      System.out.println(x.length());
		for (int i=x.length()-1; i>=0; i--)
		{
		
			if (x.charAt(i)==' ')
				break;
			else {
				len++;
			}
		}

		return len;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		int res = lengthOfLastWord(str);
		System.out.println(res);
	}

}
