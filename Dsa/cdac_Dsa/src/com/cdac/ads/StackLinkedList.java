package com.cdac.ads;

import java.util.*;

public class StackLinkedList {

	private static class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = next;
	 }
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StackLinkedList s = new StackLinkedList();
		
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


