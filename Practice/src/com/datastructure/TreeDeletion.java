package com.datastructure;

import com.practice.waste.Node;

public class TreeDeletion {
	Node root;

	private void delete(int n) {

		rearrange(root, n);

	}

	private Node rearrange(Node root2, int n) {
		if (root2 == null) {
			return root2 ;
		}

		if (root2.data > n) {
			rearrange(root2.left, n);
		}
		else if (root2.data < n) {
			rearrange(root2.right, n);
		}
		else if(root2.data==n) {
			if(root2.right==null) {
				return root2.left;
			}
			if(root2.left==null) {
				return root2.right;
			}
			
			
			minValue(root2.right);
		}
		return root2;

	}

	private void minValue(Node root2) {
		int min=root2.data;
		while(root2.left!=null) {
			min=root2.left.data;
			
		}
		
	}

	public static void main(String[] args) {
		TreeDeletion td = new TreeDeletion();
		td.root = new Node(50);
		td.root.right = new Node(75);
		td.root.right.left = new Node(70);
		td.root.right.right = new Node(85);
		td.root.left = new Node(40);
		td.root.left.right = new Node(45);
		td.root.left.left = new Node(35);
		td.root.left.left.right = new Node(47);
		td.root.left.left.left = new Node(30);

		td.delete(40);

	}

}
