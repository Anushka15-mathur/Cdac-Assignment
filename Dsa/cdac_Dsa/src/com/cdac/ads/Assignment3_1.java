package com.cdac.ads;

public class Assignment3_1 {

	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
			
		}
	}
	
	Node head;
	
	//insert at end
	
	public void insertEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	//print
	
	public void display() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + " ");
			if(currNode.next != null) {
				System.out.print("->");
			}
			currNode = currNode.next;
		}
		
	}
	
	
	public static void main(String[] args) {
		
       Assignment3_1 list = new Assignment3_1();
       
       System.out.println("Initial list: ");
       list.insertEnd(5);
       list.insertEnd(10);
       list.insertEnd(15);
       
       list.display();
       
       System.out.println("\nUpdated list: ");
       list.insertEnd(20);
       list.insertEnd(25);
       
       list.display();
       
	}

}
