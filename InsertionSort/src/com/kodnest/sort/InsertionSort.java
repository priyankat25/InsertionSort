package com.kodnest.sort;

public class InsertionSort {
	public static int[] insertionSorting(int[] arr) {
		int item;
		for(int i=1; i<=arr.length-1; i++) {
			int j = i - 1;
			item = arr[i];
			while(j>=0 && arr[j]>item) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = item;
		}
		return arr;		
	}	 
}