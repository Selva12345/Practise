package com.rebirth;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

import javax.management.Query;

public class Duplicate {
	public <E> String idea(Collection<? extends E> c)   {
		c.parallelStream().forEach(s->{
			//System.out.println(s);
		});
		return null;
		
		
	}
	interface Function<T, R>{
	}
	
	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("Hello s");
		l.add("dark");
		l.add("here");
		System.out.println(l);
		java.util.TreeSet<String>  t=new TreeSet<>();
		t.add("Im here");
		Duplicate d=new Duplicate();
		d.idea(l);
		Stack<String> s=new Stack<>();
		s.push("Walker");
		s.push("Crazy");
        //        System.out.println(s.peek());
          //      System.out.println(s.size());
		for (String string : s) {
			//System.out.println(string);
		}
		
Queue<String> q=new ArrayDeque<>();
Queue<String > p=new LinkedList<>();
Queue<String > m=new PriorityQueue<>();
q.add("Hello");
q.add("Here");
q.add("We go");
System.out.println(q);
System.out.println(q.peek());
System.out.println(q.poll());
System.out.println(q.poll());
System.out.println(q.size());
}

	

	


	
}

