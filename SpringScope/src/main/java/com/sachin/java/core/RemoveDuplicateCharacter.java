package com.sachin.java.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateCharacter {	

	public static void main(String[] args) {
		String str = "ohhh!Itisveryhottoday";
		 char[] charArr = str.toCharArray();
		//Character maxChar = maxOccur(str);
       // System.out.printf("In string '%s' the most ocurred char is '%c':",str,maxChar);
		 System.out.printf("String of characters before removing duplicate character = '%s' %n", str); 
		 String resultStr = removeDuplChar(charArr);
		 System.out.printf("String of characters after removing duplicate character = '%s' %n", resultStr.toString()); 
	}
	
	private static String removeDuplChar(char[] charArr) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		StringBuilder resultStr=new StringBuilder();
		for(Character c : charArr) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
				
			}else {
				charMap.put(c, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();             
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() == 1) {
            	resultStr = resultStr.append(entry.getKey());               
            }
                     
        }              
		return resultStr.toString();
	}

	private static Character maxOccur(char[] charArr) {		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(Character c : charArr) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
				
			}else {
				charMap.put(c, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", charArr.toString());
        int maxOccurCount=0;
        char maxOccurChar = 0;
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
            if(entry.getValue() > maxOccurCount) {
               maxOccurCount =entry.getValue();
               maxOccurChar = entry.getKey();
            }           
        }          
		return maxOccurChar;
	}
	
	


}
