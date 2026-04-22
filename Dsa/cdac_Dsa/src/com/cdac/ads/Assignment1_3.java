package com.cdac.ads;

public class Assignment1_3 {

	static void reverse(char arr[], int left, int right) {
		
		if(left >= right) {
			
			return;
		}
		
		char temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		
		reverse(arr, left + 1, right - 1 );
		
	}
	
	public static void main(String[] args) {
		
		String input = "recursion";
		
		char arr[] = input.toCharArray();
		
		reverse(arr, 0, arr.length-1);
		
		String result = new String(arr);
		
		System.out.println(result);

	}

}
