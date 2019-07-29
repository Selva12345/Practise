package com.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//height of tree
class TreeUsingQueue  
{ 
    Node root; 
   
    // Iterative method to find height of Binary Tree 
    int treeHeight(Node node)  
    { 
        // Base Case 
        if (node == null) 
            return 0; 
   
        // Create an empty queue for level order tarversal 
        Queue<Node> q = new LinkedList(); 
       // List<Node> q=new ArrayList<Node>(); is possible
        LinkedList<Node> li=new LinkedList<Node>();
        
   
        // Enqueue Root and initialize height 
        q.add(node); 
        int height = 0; 
   
        while (1 == 1)  
        { 
            // nodeCount (queue size) indicates number of nodes 
            // at current lelvel. 
            int nodeCount = q.size(); 
            if (nodeCount == 0) 
                return height; 
            height++; 
   
            // Dequeue all nodes of current level and Enqueue all 
            // nodes of next level 
            while (nodeCount > 0)  
            { 
                Node newnode = q.peek(); 
                q.remove(); 
                if (newnode.left != null) 
                    q.add(newnode.left); 
                if (newnode.right != null) 
                    q.add(newnode.right); 
                nodeCount--; 
            } 
        } 
    } 
   
    // Driver program to test above functions 
    public static void main(String args[])  
    { 
    	TreeUsingQueue tree = new TreeUsingQueue(); 
          
        // Let us create a binary tree shown in above diagram 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(7); 
        tree.root.right.right = new Node(6);
        System.out.println("Height of tree is " + tree.treeHeight(tree.root)); 
    } 
} 
 
class Node {
	Node left, right;
	int data;

	Node(int d) {
		data = d;
		left = right = null;

	}
}