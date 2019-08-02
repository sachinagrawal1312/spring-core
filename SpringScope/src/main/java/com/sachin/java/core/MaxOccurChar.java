package com.sachin.java.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxOccurChar {

	public static void main(String[] args) {
		String str = "ohhh!Itisveryhottoday";
		Character maxChar = maxOccur(str);
        System.out.printf("In string '%s' the most ocurred char is '%c':",str,maxChar);
	}

	private static Character maxOccur(String str) {
		char[] charArr = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(Character c : charArr) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
				
			}else {
				charMap.put(c, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", str);
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
