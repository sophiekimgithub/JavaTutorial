package org.java.sorting;
/*
 * Time Complexity : O(n^2)
 * 
 * */
public class InsertionSort {
	
	public static void main(String[] args) {
		int [] array = {9, 14, 3, 2, 43, 11, 58, 22};
		int length = array.length;
		
		for(int i=1; i<length; i++) {
			int key = array[i];
			int j = i - 1;
			
			while( (j>-1) && (array[j] > key)) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}

		for(int i:array) {
			System.out.print(i+" ");
		}
	}
}
