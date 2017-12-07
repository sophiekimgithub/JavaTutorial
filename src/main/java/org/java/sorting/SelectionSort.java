package org.java.sorting;

/*
 * Time Complexity : O(n^2)
 * 
 * */
public class SelectionSort {
	
	public static void main(String[] args) {
		int [] unsortedIntArry = {29, 10, 14, 37, 13, 9}; 
		int length = unsortedIntArry.length;
		int minValue;
		
		for(int i=0; i<length-1; i++) {
			minValue = i;
			for(int j=i+1; j<length; j++) {
				if(unsortedIntArry[j] < unsortedIntArry[minValue]) {
					minValue = j;
				}
			}
			swap(unsortedIntArry, minValue, i); 
		}
		
		for(int i:unsortedIntArry) {
			System.out.print(i+ " ");
		}
	}
	
	public static void swap(int [] input, int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
}

