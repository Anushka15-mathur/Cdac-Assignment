package com.cdac.ads;



public class Assignmnet2_1 {

public static void bubbleSort(int[] arr) {
	
	int n = arr.length;
	
	for (int i = 0; i < n-1 ; i++) {
		
		for(int j = 0 ; j < n-1 -i; j++) {
			
			if(arr[j] > arr[j+1]) {
				
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				
			}
		}
		printArray(arr);
	}
	
}
	
public static void printArray(int arr[]) {
	
	for(int num : arr) {
		
		System.out.print(num + " ");
	}
	
	System.out.println();
}
	
	public static void main(String[] args) {
		
        int arr[] = {4,3,2};
        
        System.out.println("Before Sorting");
        
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("After Sorting");
        printArray(arr);
		
		

	}

}
