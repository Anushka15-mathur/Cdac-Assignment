package com.cdac.ads;

public class Assignment1_4 {

	static boolean isSorted(int arr[], int index) {
		
		if(index == arr.length - 1) {
			
			return true;
		}
		
		if(arr[index] > arr[index + 1]) {
			
			return false;
		}
		
		return isSorted(arr, index + 1);
	}
	
	public static void main(String[] args) {
		
		int[] arr1 = {2, 4, 6, 8};
		int[] arr2 = {3, 5, 2, 9};
		
		System.out.println(isSorted(arr1, 0));
		System.out.println(isSorted(arr2, 0));

	}

}
