package com.kodnest.sort;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int[] sortedArr = InsertionSort.insertionSorting(arr);
		for(int sortArr: sortedArr) {
			System.out.print(sortArr + " ");
		}
	}
}