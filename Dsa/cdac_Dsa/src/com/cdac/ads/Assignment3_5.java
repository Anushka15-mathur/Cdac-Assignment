package com.cdac.ads;

public class Assignment3_5 {
	
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
	
	//deleteEnd
	
	public void deleteEnd() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		
		if(head.next == null) {
		   head = null;
		   return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;//head.next = null -> lastNode = null
		while(lastNode.next != null) {//null.next not possible , to avoid this one more condition
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		
		secondLast.next = null;
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
		
		Assignment3_5 list = new Assignment3_5();
		
		System.out.println("Initial list: ");
		list.insertFirst(40);
		list.insertFirst(30);
		list.insertFirst(20);
		list.insertFirst(10);
		
		list.display();
		
		System.out.println("\nUpdated list: ");
		list.deleteEnd();
		
		list.display();
		

	}

}
