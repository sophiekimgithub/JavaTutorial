package org.java.eg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescendString {

	public static void main(String[] args) {		
		String [] strArry = {"bbb", "AAA", "DDD", "what is this", "CCC", "aaa"};	
		Arrays.sort(strArry, String.CASE_INSENSITIVE_ORDER);
		for(String s:strArry) { 
			System.out.print(s + " ");
		}
		System.out.println("");
		
		List<String> list = Arrays.asList(strArry);
		Collections.reverse(list);
		list.forEach(listL->System.out.print(listL + " "));
		
		System.out.println("");
		strArry = (String[]) list.toArray();
		for(String s:strArry) { 
			System.out.print(s + " ");
		}
	}
}
