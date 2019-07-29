package com.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
	int data;
	int a[];
	private int capacity;
	int count;
	 QueueImplementation(int size){
		 a=new int[size];
		 capacity=size;
		 count=0;
		
	}

private void enqueue(int i) {
if(count<capacity) {
a[count]=i;	
count++;
}
}

public static void main(String[] args) {
	Queue<Integer> qu=new LinkedList<Integer>();
	
	QueueImplementation q=new QueueImplementation(6);
	q.enqueue(2);
	q.enqueue(4);
	q.enqueue(6);
	q.enqueue(9);
	
	
}


}
