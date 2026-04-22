package com.cdac.ads;

import com.cdac.ads.Assignment3_8.Node;

public class Assignment3_9 {
	
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
	
	//reverse linked list
	
	public void reverse() {
		Node prev = null;
		Node curr = head;
		Node next;
		
		while (curr != null) {
			next = curr.next; //store next
			curr.next = prev; //reverse link  
			prev = curr; //move prev
			curr = next; //move curr
		}
		head = prev; // update head
	}
	
   
	public void display() {
		Node currNode = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		
		
		while(currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
		
	}

	public static void main(String[] args) {
      Assignment3_9 list = new Assignment3_9();
		
		System.out.println("Initial list: ");
		
		list.insertFirst(40);
		list.insertFirst(30);
		list.insertFirst(20);
		list.insertFirst(10);
		
		list.display();
		
		System.out.println("\nReversed  list: ");
		list.reverse();
		list.display();

	}

}
