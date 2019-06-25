package com.problems;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueProblems {
public static void main(String[] args) {
	Queue<String> q=new LinkedList<>();
//Deque<String>dq=new  LinkedList<>();
Stack<String> st=new Stack<>();
q.add("Hi");
q.add("Hello");
q.add("How r u");
q.add("good");
q.add("going on");
q.add("Bye");
int l=q.size();
for (int i = 0; i <l; i++) {
	//System.out.println(st.add(q.poll()));
}
Iterator<String>li=st.iterator();
while (!q.isEmpty()) {
	st.add(q.poll());
	
}
while(!st.isEmpty()) {
	System.out.println(st.pop());
	
}
}
}
