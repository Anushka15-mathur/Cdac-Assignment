package com.cdac.ads;

import java.util.Scanner;

public class CircularQueue {
	
	int size = 5;
	int queue[] = new int[size];
	int front = -1;
	int rear = -1;
	
	boolean isFull() {
		return (front == 0 && rear == size -1) || (rear + 1 == front);
	}
	
	boolean isEmpty() {
		return front == -1;
	}
	
	void enqueue(int value) {
		if(isFull()) {
			System.out.println("Circular Queue Overflow");
			return;
		}
		
		if(isEmpty()) {
			front = 0;
			rear = 0 ;
		}
		else if(rear == size - 1) {
			rear = 0;
		}
		else{
			rear++;
		}
		queue[rear] = value;
		System.out.println(value+ " inserted into circular queue");
	}
	
	int dequeue() {
		
		if(isEmpty()) {
			System.out.println("Circular Queue Underflow");
			return -1;
		}
		
		int removed = queue[front];
		
		if(front == rear) {
			front =-1;
			rear = -1;
		}
		else if(front == size -1) {
			front = 0;
		}
		else {
			front++;
		}
		
	     return removed;
	}
	
	void display() {
		if(isEmpty()) {
			System.out.println("Circular queue is Empty");
			return;
		}
		
		System.out.println("Circular queue elements: ");
		int i = front;
		
		while(true) {
			
			System.out.println(queue[i]+ " ");
			if(i == rear) {
				break;
			}
			i = (i + 1) % size;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CircularQueue q = new CircularQueue();
		
		while(true) {
			
			System.out.println("\n Circular Queue Operations");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			
			System.out.println("Enter your choice: ");
			
			int choice =sc.nextInt();
			
			switch(choice) {
			
			case 1:{
				
				System.out.println("Enter value: ");
				int value = sc.nextInt();
				q.enqueue(value);
				break;
			}
			
			case 2:{
				int removed = q.dequeue();
				if(removed != -1) {
					System.out.println(removed + "removed from Circular Queue");
				}
				break;
			}
			
			
			case 3:{
				q.display();
				break;
			}
			case 4:{
				System.out.println("Exiting.....");
				sc.close();
				return;
			}
			
			default:{
				System.out.println("Invalid choice");
			}
			
			}
		}

	}

}
