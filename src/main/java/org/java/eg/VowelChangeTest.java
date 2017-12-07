package org.java.eg;

import java.util.Hashtable;
import java.util.Scanner;

public class VowelChangeTest {

	public static boolean isVowel(char input) {		
		char vCharArry[] = {'a','e','i','o','u'};
		for(char c:vCharArry) {
			if(input==c) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
	
//		Scanner sc = new Scanner(System.in);
//		String sampleStr = sc.nextLine();
//		sc.close();
		String sampleStr = "pineapple"; 
		int strLength = 0;
		int hIdx = 0;
		int tIdx = 0;
		strLength = sampleStr.length() - 1;
		tIdx = strLength;
		char [] charArry = sampleStr.toCharArray();
		
		while(hIdx<tIdx) {
			
			while(!(isVowel(charArry[hIdx]))) hIdx++;    
			
			while(!(isVowel(charArry[tIdx]))) tIdx--;
			
			if(isVowel(charArry[hIdx]) && isVowel(charArry[tIdx])) {
				char charTemp = charArry[hIdx];
				charArry[hIdx] = charArry[tIdx];
				charArry[tIdx] = charTemp;
				
				hIdx++;
				tIdx--;
			}
		}
		System.out.println(String.valueOf(charArry));
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("A", 2);
		ht.put("B", 1);
		
		ht.forEach((a,b) -> System.out.println(a+":"+b));
		System.out.println("A".hashCode());
	}

	
}

