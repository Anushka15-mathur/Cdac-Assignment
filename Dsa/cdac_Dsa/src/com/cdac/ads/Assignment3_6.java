package com.cdac.ads;

public class Assignment3_6 {
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head;
	
	public void inserFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	//deleteAtPosition
	
	public void deletePosition(int value) {
		//case : empty list
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		//value at head
		if(head.data == value) {
			head = head.next;
			return;
		}
		Node currNode =  head;
		// to find node before target
		while(currNode.next != null && currNode.next.data != value) {
			currNode = currNode.next;
		}
		//value not found
		if(currNode.next == null) {
			System.out.println("Value not found");
			return;
		}
		
		//delete node
		currNode.next = currNode.next.next;
	}
	
	public void display() {
		Node currNode = head;
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		while(currNode != null) {
			System.out.print(currNode.data + " ");
			if(currNode.next != null) {
				System.out.print("->");
			}
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		
		Assignment3_6 list = new Assignment3_6();
		
		System.out.println("Initial list: ");
		list.inserFirst(40);
		list.inserFirst(30);
		list.inserFirst(20);
		list.inserFirst(10);
		
		list.display();
		
		System.out.println("\nUpdated list: ");
		
		list.deletePosition(30);
		list.display();
		
		
		

	}

}
