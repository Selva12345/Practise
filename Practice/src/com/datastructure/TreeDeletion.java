package com.datastructure;

import com.practice.waste.Node;

public class TreeDeletion {
	Node root;

	private void delete(int n) {

		Node nodes = rearrange(root, n);
		printTree(nodes);

	}

	private Node rearrange(Node root2, int n) {
		if (root2 == null) {
			return root2;
		}

		if (root2.data > n) {
			 root2.left = 	rearrange(root2.left, n);
		} else if (root2.data < n) {
			 root2.right =rearrange(root2.right, n);
		} else {
			if (root2.left == null) {
				return root2.right;
			}
			if (root2.right == null) {
				return root2.left;
			}

			root2.data = minValue(root2.right);
			root2.right=rearrange(root2.right, root2.data);
		}
		return root2;

	}

	private int minValue(Node root2) {
		int min = root2.data;
		while (root2.left != null) {
			min = root2.left.data;
			root2 = root2.left;
		}
		return min;

	}

	public static void main(String[] args) {
		TreeDeletion td = new TreeDeletion();
		td.root = new Node(50);
		td.root.right = new Node(75);
		td.root.right.left = new Node(70);
		td.root.right.right = new Node(85);
		td.root.left = new Node(40);
		td.root.left.right = new Node(45);
		td.root.left.right.left = new Node(32);
		td.root.left.right.right = new Node(48);
		td.root.left.left = new Node(35);
		td.root.left.left.right = new Node(47);
		td.root.left.left.left = new Node(30);

		td.delete(40);
		// td.inorder();

	}

	private void inorder() {
		printTree(root);
	}

	private void printTree(Node root2) {
		if (root2 == null)
			return;

		printTree(root2.left);
		System.out.print(root2.data + " ");
		printTree(root2.right);
	}

}
