package com.cdac.ads;

public class Assignment3_4 {
	
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

	//deleteFirst
	public void deleteFirst() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		
		head = head.next;
	}
	
	public void display() {
		Node currNode = head;
		
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		
		while(currNode != null) {
			System.out.print(currNode.data + " ");
			if(currNode.next != null ) {
				System.out.print("->");
			}
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		
		Assignment3_4 list = new Assignment3_4(); 
		
		System.out.println("Initial list: ");
		
		list.insertFirst(40);
		list.insertFirst(30);
		list.insertFirst(20);
		list.insertFirst(10);
		
		list.display();
		
		System.out.println("\nUpdated list: ");
		
		list.deleteFirst();
		list.display();
	    

	}

}
