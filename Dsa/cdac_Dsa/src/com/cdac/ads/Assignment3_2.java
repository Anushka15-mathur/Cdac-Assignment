package com.cdac.ads;

public class Assignment3_2 {
    
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head;
	
	//insert first
	
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
		   head = newNode;
		   return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void display(){
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
	Assignment3_2 list = new Assignment3_2();

	   System.out.println("Initial list: ");
	   list.insertFirst(30);
	   list.insertFirst(20);
	   list.insertFirst(10);
	   
	   list.display();
	   
	   System.out.println("\nUpdated list: ");
	   list.insertFirst(5);
	   
	   list.display();
	}

}
