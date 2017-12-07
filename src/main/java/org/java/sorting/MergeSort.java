package org.java.sorting;

import java.util.Arrays;

/*
 * Time Complexity : O(nlogn)
 * Collections.sort()
 * */
public class MergeSort {
	
	public static void main(String[] args) {
		int [] arry = {5, 2, 4, 7, 1, 3, 2, 6};
		//mergeSort(arry);
		System.out.println(Arrays.toString(arry));
	}
	
	public static void mergeSort(int [] arry) {
		int length = arry.length;
		int pivot;
		if(length>1) {
			pivot = length/2;
			int [] leftArray = Arrays.copyOfRange(arry, 0, pivot);
			int [] rightArray = Arrays.copyOfRange(arry, pivot+1, length);
			
			mergeSort(leftArray);
			mergeSort(rightArray);
			
			arry = merge(leftArray, rightArray);
			
		}
	}
	
	public static int[] merge(int [] l, int [] r) {
		int totElem = l.length + r.length;
        int[] a = new int[totElem];
        int i,li,ri;
        i = li = ri = 0;
        while ( i < totElem) {
            if ((li < l.length) && (ri<r.length)) {
                if (l[li] < r[ri]) {
                    a[i] = l[li];
                    i++;
                    li++;
                }
                else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            }
            else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }
        }
        return a;
	}


}
