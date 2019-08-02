package com.sachin.java.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringWords {

	public static void main(String args[]) {
		String str = "Today is Thursday";
		System.out.printf("Reverse of the string '%s' is '%s' :%n ",str,reverseWords(str));
		System.out.printf("Reverse of the string '%s' is '%s': ",str,reverseString(str));
	  }
	 
	  /*
	  * Method to reverse words in String in Java
	  */
	  public static String reverseWords(String sentence) {
	  List< String> words = Arrays.asList(sentence.split("\\s"));
	  Collections.reverse(words);
	  StringBuilder sb = new StringBuilder(sentence.length());
	 
	  for (int i =0; i <words.size(); i++) {
	  sb.append(words.get(i));
	  sb.append(' ');
	  }
	 
	  return sb.toString().trim();
	  }
	 
	  public static String reverseString(String line) {
	  if (line.trim().isEmpty()) {
	  return line;
	  }
	 
	  StringBuilder reverse = new StringBuilder();
	  String[] sa = line.trim().split("\\s");
	 
	  for (int i = sa.length - 1; i >= 0; i--) {
	  reverse.append(sa[i]);
	  reverse.append(' ');
	  }
	 
	  return reverse.toString().trim();
	  }
	}

