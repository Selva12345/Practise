package com.datastructure;

import java.util.Iterator;
import java.util.LinkedList;
//BFS (Breath first search)
public class GraphPractice {
	int v;
	private LinkedList<Integer> li[];

	GraphPractice(int i) {
		v = i;
		li = new LinkedList[v];
		for (int j = 0; j < v; j++) {
			li[j] = new LinkedList();
		}
	}

	private void addEdge(int i, int j) {
		li[i].add(j);
	}

	private void show(int s) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		boolean[] visited = new boolean[v];
		visited[s] = true;
		list.add(s);

		while (list.size() != 0) {
			s=list.poll();
			System.out.println(s+" ");
			Iterator<Integer> i = li[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if(visited[n]==false) {
					visited[n] = true;
					list.add(n);
				}
			
			}

		}
	}

	public static void main(String[] args) {
		GraphPractice gp = new GraphPractice(5);
		// double s= 1/0;
		// System.out.println(s);
		gp.addEdge(1, 4);
		gp.addEdge(1, 3);
		gp.addEdge(3, 2);
		gp.addEdge(4, 3);
		gp.addEdge(3, 0);
		gp.addEdge(0, 1);
		gp.show(0);
	}

}
