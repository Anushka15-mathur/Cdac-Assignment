package com.cdac.ads;

public class SimpleDoublyLinkedList {

	private static class Node{
		int data;
		
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
		}
	}
	
	Node head;
	Node tail;
	
	void insertAtBeginning(int value) {
		Node newNode = new Node(value);
		
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	
	void insertAtEnd(int value) {
		Node newNode = new Node(value);
		
		if(head ==null) {
			head = tail = newNode;
			return;
		}
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}
	
	void insertAtPosition(int value, int position) {
		if(position <= 1 || head == null) {
			insertAtBeginning(value);
			return;
		}
		
		Node current = head;
		int index = 1;
		
		while(current.next != null && index < position -1) {
			current = current.next;
			index++;
		}
		
		if(current.next == null) {
			insertAtEnd(value);
			return;
		}
		
		Node newNode = new Node(value);
		Node nextNode = current.next;
		
		current.next = newNode;
		newNode.prev = current;
		current.next = nextNode;
		newNode.prev = newNode;
	}
	
	void displayForward() {
		if(head == null) {
			System.out.println("Doubly linked list is empty");
			return;
			
		}
		
		System.out.println("Forward: ");
		Node current = head;
		
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		
		System.out.println();
	}
	
	void displayBackward() {
		if(head == null) {
			System.out.println("Doubly linked list is empty");
			return;
			
		}
		
		System.out.println("Backward: ");
		Node current = tail;
		
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.prev;
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		SimpleDoublyLinkedList DLL  = new SimpleDoublyLinkedList();
        
		DLL.insertAtBeginning(10);
		DLL.insertAtBeginning(20);
		DLL.insertAtBeginning(30);
		
		DLL.insertAtEnd(40);
		//DLL.displayForward();
		//DLL.displayBackward();
		
		DLL.insertAtPosition(1000,2);
		
	}

}
