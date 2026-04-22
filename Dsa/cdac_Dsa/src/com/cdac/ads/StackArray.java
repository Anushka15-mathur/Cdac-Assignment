package com.cdac.ads;

import java.util.*;

public class StackArray {

	int size = 5;
	int arr[] = new int[size];
	int top = -1;
	
	boolean isFull() {
		
		return top == size -1;
	}
	
	boolean isEmpty() {
		
		return top == -1;
	}
	
	void push(int value) {
		
		if(isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		
		arr[++top] = value;
		System.out.println(value + " pushed into stack");
	}
	
	int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		
		return arr[top--];
	}
	
	void peek() {
		
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println("Top element: " + arr[top]);
		}
	}
	
	void display(){
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("Stack elements: ");
		for(int i = top; i >= 0; i--) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	StackArray s = new StackArray();
	
    while(true) {
    	
    	System.out.println("\nStack Operations");
    	System.out.println("1.Push");
    	System.out.println("2.Pop");
    	System.out.println("3.Peek");
    	System.out.println("4.Display");
    	System.out.println("5.Exit");
    	
    	System.out.println("Enter your choice");
    	int choice = sc.nextInt();
    	
    	switch(choice) {
    	
    	case 1:{
    		System.out.println("Enter value");
    		int val = sc.nextInt();
    		s.push(val);
    		break;
    	}
    	
    	case 2:{
    		int removed = s.pop();
    		if(removed != -1) {
    			System.out.println(removed + " popped from Stack");
    		}
    		break;
    	}
    	
    	case 3:{
    		s.peek();
    		break;
    	}
    	
    	case 4:{
    		s.display();
    		break;
    	}
    	
    	case 5:{
    		System.out.println("Exiting...");
    		sc.close();
    		return;
    	}
    	
    	default: 
    		System.out.println("Invalid choice");
    	
    	 }
      } 
	
	}

}
