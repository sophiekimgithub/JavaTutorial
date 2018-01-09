package org.java.eg;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		boolean rtnBool = false;
		if(args[0]!=null && !args[0].isEmpty() && args[1]!=null && !args[1].isEmpty()) {
			rtnBool = checkAnagram(args[0], args[1]);
		}
		System.out.println(rtnBool);
	}
	
	public static boolean checkAnagram(String inputStr1, String inputStr2) {
		System.out.println(inputStr1 + ":" + inputStr2);

		if (inputStr1 == null || inputStr1.isEmpty() || inputStr2 == null || inputStr2.isEmpty()
				|| inputStr1.length() != inputStr2.length()) {
			return false;
		}

		char[] charArry1 = inputStr1.toCharArray();
		char[] charArry2 = inputStr2.toCharArray();
		
		Arrays.sort(charArry1);
		Arrays.sort(charArry2);
		
		return String.valueOf(charArry1).equals(String.valueOf(charArry2));

	}
	
}
