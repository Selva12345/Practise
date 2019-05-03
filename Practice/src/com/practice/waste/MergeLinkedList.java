package com.practice.waste;

import java.util.Arrays;
import java.util.Collections;

import com.practice.waste.LinkedList.Node;

public class MergeLinkedList {
	Node head;
	static Node newNode1;
	static Node newNode;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;

		}
	}

	void push(int i) {

		newNode = new Node(i);
		if (head == null) {
			head = newNode;
			// System.out.println(head.data);
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	void pushit(int i) {

		newNode1 = new Node(i);
		if (head == null) {
			head = newNode1;
			// System.out.println(head.data);
			return;
		}
		newNode1.next = head;
		head = newNode1;
	}

	void merge(Node newVaule, Node newValue1) {
		Node tnode = head;
		int a[] = new int[7];
		int i=0;
		while (tnode != null) {
			
			a[i]=tnode.data;
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
			i++;
		}
		Arrays.sort(a);
		 System.out.printf("Modified arr[] : %s",
                 Arrays.toString(a));
	}

	public static void main(String[] args) {
		MergeLinkedList mergeLinkedLit = new MergeLinkedList();
		mergeLinkedLit.push(5);
		mergeLinkedLit.push(6);
		mergeLinkedLit.push(9);
		mergeLinkedLit.push(4);

		////////////
		mergeLinkedLit.pushit(1);
		mergeLinkedLit.pushit(3);
		mergeLinkedLit.pushit(7);
		mergeLinkedLit.merge(newNode, newNode1);
	}

}
