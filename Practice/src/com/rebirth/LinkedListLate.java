package com.rebirth;

public class LinkedListLate {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	void push(int s) {
		if(head==null) {
			head=new Node(s);
		}
		else {
		Node n=head;
		head =new Node(s);
		head.next=n;
		}
		
	}
public static void main(String[] args) {
	LinkedListLate lt=new LinkedListLate();
	lt.push(2);
	lt.push(3);
	lt.push(5);
}
}
