package org.java.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaDemo2 {
	
	public static void main(String[] args) {
		
		Runnable runObj = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("No Lamdba");
				
			}
		};
		
		Runnable lambdaObj = () -> System.out.println("Lambda");
		
		// parameter -> expression
		// () -> method body; 
		// a -> method body;
		// (a, b) -> method body;
		// () -> {
		//			method body1;
		//			method body2; 
		//			return ss;
		//		};
		
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Sophie");
		list.add("Tom");
		list.add("Anna");
		
//		Comparator<String> comp = new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2);
//			}
//		};
//		Collections.sort(list, comp);
		
		Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		list.forEach( s -> System.out.println(s));
		list.forEach(System.out::println);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C"); 
		map.forEach((x,y) -> System.out.println(x+":"+y));
		
		
		List<String> names = new ArrayList<>();
		names.add("ABC");
		names.add("DEF");
		names.forEach(System.out::println);
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "jkl");
		List<String> filteredString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println(strings);
		
		
		
	}

}
