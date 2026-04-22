package com.cdac.ads;

public class Assignment3_3 {

	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head;
	
	//insert at first
	
	public void insertFirst(int data) {
		
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void insertPosition(int data, int position) {
		Node newNode = new Node(data);
		if(position == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		
		Node currNode = head;
		
		for(int i = 0 ; i < position -1 ; i++) {
			if(currNode == null) {
				System.out.println("Invalid position");
				return;
			}
			currNode = currNode.next;
		}
		
		newNode.next = currNode.next;
		currNode.next = newNode;
	}
	
	public void display() {
		if(head == null) {
			System.out.println("list is empty");
		}
		
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data+ " ");
			if(currNode.next != null) {
				System.out.print("->");
			}
			
			currNode = currNode.next;
		}
	}
	
	
	public static void main(String[] args) {
		
		Assignment3_3 list = new Assignment3_3();
		
		System.out.println("Initial list: ");
		list.insertFirst(40);
		list.insertFirst(30);
		list.insertFirst(20);
		list.insertFirst(10);
		
		list.display();
		
		System.out.println("\nUpdated list: ");
		
		list.insertPosition(25, 2);
		
		list.display();
		

	}

}
