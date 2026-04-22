package com.cdac.ads;

public class Assignment3_7 {

	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head;
	
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;	
	}
	
	//search
	
	public void search(int key) {
		Node currNode = head;
		int index = 0;
		
		while(currNode != null) {
			if(currNode.data == key) {
				System.out.println("Element found at index : " + index);
				return;
			}
			currNode = currNode.next;
			index++;
		}
		System.out.println("Element not found");
	}
	
	public void display() {
		Node currNode = head;
		
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		
		while(currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}
	
	public static void main(String[] args) {
		
		Assignment3_7 list = new Assignment3_7();
		
		 System.out.println("Initial list: ");
		 
         list.insertFirst(40);
         list.insertFirst(30);
         list.insertFirst(20);
         list.insertFirst(10);
         
         list.display();
         
         System.out.println("\nSearching for element 30: " );
         list.search(30);
	}

}
