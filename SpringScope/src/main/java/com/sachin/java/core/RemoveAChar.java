package com.sachin.java.core;

public class RemoveAChar {

	public static void main(String[] args) {
		String str = "DXC Technology";
		char[] charArr = str.toCharArray();		
		System.out.printf("String of characters before removing a character '%c'= '%s' %n", 'X', str); 
		String resultStr = removeChar(charArr,'X');
		System.out.printf("String of characters after removing a character '%c' = '%s' %n", 'X', resultStr.toString()); 
		String resultStr2 = replaceChar(str,"X");
		System.out.printf("String of characters after removing a character '%c' = '%s' %n", 'X', resultStr2.toString()); 
	}
	
	private static String removeChar(char[] charArr, char ch) {		
		StringBuilder resultStr=new StringBuilder();
		for(Character c : charArr) {
			if(c != ch) {
				resultStr.append(c);
			}
		}		 
		return resultStr.toString();
	}
	
	private static String replaceChar(String str, String repl) {		
		return str.replaceAll("X", "");
	}
}
