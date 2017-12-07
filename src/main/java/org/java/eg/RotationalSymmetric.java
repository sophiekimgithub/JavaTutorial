package org.java.eg;

import java.util.HashMap;
import java.util.Scanner;

public class RotationalSymmetric {

	public static boolean checkRotationalSymmetric(String inputStr) {
		 
		int hIdx = 0;
		int tIdx = 0;
		HashMap<String, String> rotateHashMap = new HashMap<>();
		rotateHashMap.put("0", "0");
		rotateHashMap.put("1", "1");
		rotateHashMap.put("6", "9");
		rotateHashMap.put("8", "8");
		rotateHashMap.put("9", "6");
		
		if(inputStr==null) {
			System.out.println("Value must be a string");
			return false;
		}
		
		if(inputStr.isEmpty()) {
			System.out.println("Value must not be empty string");
			return false;
		}	
		
		tIdx = inputStr.length()-1;
		
		while(hIdx <= tIdx) {
			boolean isPair = rotateHashMap.containsKey(String.valueOf(inputStr.charAt(hIdx)));
			if(!isPair) {
				return false;
			}
			if(!(rotateHashMap.get(String.valueOf(inputStr.charAt(hIdx))).equals(String.valueOf(inputStr.charAt(tIdx))))) {
				return false;
			}
			hIdx ++;
			tIdx --;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//String inputStr = sc.nextLine();
		String inputStr = "0891680";
		
		System.out.println(checkRotationalSymmetric(inputStr));
	}
}
