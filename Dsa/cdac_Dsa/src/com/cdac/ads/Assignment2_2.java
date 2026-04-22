package com.cdac.ads;

import java.util.Arrays;

public class Assignment2_2 {

    public static int[] insertElement(int arr[], int key) {
    	
    	int n = arr.length;
    	
    	int newArr[] = new int[n + 1];
    	
    	for(int i = 0; i < n ; i++) {
    		
    		newArr[i] = arr[i];
    	}
    	
    	int i = n-1;
    	
    	while(i >= 0 && newArr[i] > key) {
    		
    		newArr[i + 1] = newArr[i];
    		i--;
    	}
    	
    	newArr[i + 1] = key;
    	
    	return newArr;
    }
	
	public static void main(String[] args) {
		
		int arr[] = {1, 3, 5, 7};
		int key = 4;
		
		int result[] = insertElement(arr, key);
		
		System.out.println(Arrays.toString(result));

	}

}
