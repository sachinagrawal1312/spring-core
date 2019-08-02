package com.sachin.java.core;

public class ReverseWord {

	public static void main(String[] args) {
		String reversedStr = reverse("Today is Thursday");
		System.out.printf("Reverse of the string '%s' is '%s': ","Today is Thursday",reversedStr);

	}

	private static String reverse(String string) {
		if(string ==null || string.isEmpty()) {
			return string;
		}
		StringBuilder reversedStr =new StringBuilder();
		String [] strArr = string.split("//s");
		for(String str :strArr) {
			reversedStr.append(reverseWord(str)).append(' ');
		}
	
		return reversedStr.toString();
	}

	private static String reverseWord(String str) {
		int i=0;		
		char[] charArr = str.toCharArray();
		int j = charArr.length-1;
		while(i<j) {
			char temp = charArr[i];
			charArr[i] = charArr[j];
			charArr[j] = temp;
			i++;
			j--;
		}
		return new String(charArr);
	}

}
