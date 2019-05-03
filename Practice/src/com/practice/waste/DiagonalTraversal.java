package com.practice.waste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Vector;

public class DiagonalTraversal {
	// Tree node
	static int s = 0;

	static class Node {
		int data;
		Node left;
		Node right;

		// constructor
		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	/*
	 * root - root of the binary tree d - distance of current line from rightmost
	 * -topmost slope. diagonalPrint - HashMap to store Diagonal elements (Passed by
	 * Reference)
	 */
	/*static void diagonalPrintUtil(Node root, int d, HashMap<Integer, List<Integer>> diagonalPrint) {

		// Base case
		if (root == null)
			return;

		// get the list at the particular d value
		List<Integer> k = diagonalPrint.get(d);

		// k is null then create a vector and store the data
		if (k == null) {
			k = new ArrayList<>();
			k.add(root.data);
		}

		// k is not null then update the list
		else {
			k.add(root.data);
		}

		// Store all nodes of same line together as a vector
		diagonalPrint.put(d, k);

		// Increase the vertical distance if left child
		diagonalPrintUtil(root.left, d + 1, diagonalPrint);

		// Vertical distance remains same for right child
		diagonalPrintUtil(root.right, d, diagonalPrint);
	}*/

	 static int diagonalPrintUtil(Node root,int d, HashMap<Integer, List<Integer>> diagonalPrint) {

		List<Integer> set =diagonalPrint.get(d);
		
       if(root==null) {
    	   return 0;
       }
       if(set==null) {
      set = new ArrayList<Integer>();
      
       set.add(root.data);
       }else{
    	   set.add(root.data);
       }
       diagonalPrint.put(d,set);
       diagonalPrintUtil(root.left,d+1,diagonalPrint);
       diagonalPrintUtil(root.right,d,diagonalPrint);
		return 0;
	}

	// Print diagonal traversal of given binary tree
	static void diagonalPrint(Node root) {
		// create a map of vectors to store Diagonal elements
		HashMap<Integer, List<Integer>> diagonalPrint = new HashMap<>();
		diagonalPrintUtil(root, 0, diagonalPrint);

		System.out.println("Diagonal Traversal of Binnary Tree");
		for (Entry<Integer, List<Integer>> entry : diagonalPrint.entrySet()) {
			System.out.print(entry.getValue());
		}
	}

	// Driver program
	public static void main(String[] args) {

		Node root = new Node(8);
		root.left = new Node(3);
		root.right = new Node(10);
		root.left.left = new Node(1);
		root.left.right = new Node(6);
		root.right.right = new Node(14);
		root.right.right.left = new Node(13);
		root.left.right.left = new Node(4);
		root.left.right.right = new Node(7);
		diagonalPrint(root);
		int level = 0;
		//diagonalPrintUtil(root);
	}
}
