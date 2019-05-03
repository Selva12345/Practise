package com.rebirth;

public class LInkedListIdea {
	 static Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
			
		}
	}
public static void main(String[] args) {
	LInkedListIdea lInkedListIdea=new LInkedListIdea();
	lInkedListIdea.append(2);
	lInkedListIdea.append(5);
	lInkedListIdea.append(7);
	print();
}
private static void print() {
		Node print=head;
	while(print!=null) {
		
		if(print!=null) {
		System.out.println(print.data);
		print=print.next;
		}
		
	}
	
}
private void append(int value) {
	 if(head==null) {
		 Node newNode1=new Node(value);
		head=newNode1;
	 }else {
		 Node last=head;
			// last=last.next;
			 head=new Node(value);
			 head.next=last;
			 last=head;
			 
	
	 } 
	   
}
}
