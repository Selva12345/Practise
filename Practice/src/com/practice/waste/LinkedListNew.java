package com.practice.waste;


public class LinkedListNew {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;

		}
	}

	private void push(int d) {
		Node node2;
		Node node1 = new Node(d);
		
		node2=head;
		head=node1;
		head.next = node2;
		//node2=head;

	}

	public void lastinsert(int d) {
		Node itr=head;
		Node last=new Node(d);
		while(itr.next!=null) {
			itr=itr.next;
		}
		itr.next=last;
	}
	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
		}

	public static void main(String[] args) {
		LinkedListNew lust = new LinkedListNew();
		lust.push(9);
		lust.push(3);
		lust.push(5);
		lust.push(7);
		lust.lastinsert(8);
		lust.printList();
		lust.remove();
		
	}
	
	public void remove() {
		Node remove=head.next;
		System.out.println(" ");
		while (remove != null) {
			System.out.print(remove.data + " ");
			remove = remove.next;
		}
		
	}

}
