package com.apex.demo;

public class ValidPalindrome {
	
	public static boolean isPalindrome(String s) {

		boolean rv = true;
		if (s == null || s.length() == 0)
			return true;

		String str = s.replaceAll("\\s+", "").toLowerCase();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i)))
				sb.append(str.charAt(i));
		}
		int first = 0;
		int last = sb.length() - 1;

		while (first < last) {

			if (sb.charAt(first) == sb.charAt(last)) {
				first++;
				last--;

			} else {

				rv = false;
				break;
			}
		}

		return rv;
	}

	public static void main(String[] args) {
		String str="race a car";
		boolean res=isPalindrome(str);
		System.out.println(res);

	}

}
