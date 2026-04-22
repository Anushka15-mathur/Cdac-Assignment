package com.cdac.ads;

public class Assignment3_8 {
	
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
	
	//count
	
	public int countNode() {
		int count = 0;
		Node currNode = head;
		
		while(currNode != null) {
			count++;
			currNode = currNode.next;
		}
		return count;
	}
	
	public void display() {
		Node currNode = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		while(currNode != null) {
			System.out.println(currNode.data + " ");
			currNode = currNode.next;
		}
		
	}

	public static void main(String[] args) {
		
		Assignment3_8 list = new Assignment3_8();
		
		System.out.println("Initial list: ");
		
		list.insertFirst(40);
		list.insertFirst(30);
		list.insertFirst(20);
		list.insertFirst(10);
		
		list.display();
		
		System.out.println("Total nodes: " + list.countNode());

	}

}
