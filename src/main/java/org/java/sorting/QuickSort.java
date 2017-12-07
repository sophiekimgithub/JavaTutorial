package org.java.sorting;

/*
 * Time Complexity : O(nlogn)
 * Arrays.sort()
 * */
public class QuickSort {

	private static void swap(int[] array, int i, int j) {
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
	private static void partition(int[] array, int headIdx, int tailIdx) {
		
		int i = headIdx;
		int j = tailIdx;
		int pivot = array[(i+j)/2];
		
		while(i<j) {
			
			while(array[i] < pivot) 
				i++;
			while(array[j] > pivot) 
				j--;
			
			if(i<=j) {
				swap(array, i, j); 
				i++;
				j--;
			}
		}
		if(headIdx < j) {
			partition(array, headIdx, j);
		}
		if(tailIdx > i) {
			partition(array, i, tailIdx);
		}
	}
	
	public static void main(String[] args) {
		int [] array = {24,2,45,20,56,75,2,56,99,53,12};
		int length = array.length;
		for(int i:array) {
			System.out.print(i+" ");
		}
		System.out.println("");
		
		partition(array, 0, length-1);
		
		for(int i:array) {
			System.out.print(i+" ");
		}
		System.out.println("");
		
		int n = 10;
		System.out.println(n * (n + 1) / 2);
		
	}

}
