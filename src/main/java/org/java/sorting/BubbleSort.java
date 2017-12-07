package org.java.sorting;

/*
 * Time Complexity : O(n^2)
 * 
 * */
public class BubbleSort {
	
	public static void main(String[] args) {
		int [] unsortedIntArry = {5, 1, 12, -5, 16}; 
		sort(unsortedIntArry);
		for(int i:unsortedIntArry) {
			System.out.print(i+" ");
		}
	}
	 
	public static void sort(int[] array) {
		int arrayLength = array.length;
		
		for(int i=0; i<arrayLength-1; i++) { 
			for(int j=0; j<arrayLength-(i+1); j++) {	
				if(array[j] > array[j+1]) {
					swap(array, j, j+1);
				}
			}
		}
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
