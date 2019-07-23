package com.datastructure;

class Trees {
	 static Node root;

	Trees() {
		root = null;
	}

	static class Node {
		Node left, right;
		int data;

		public Node(int value) {
			data = value;
			left = right = null;

		}
	}
	int h=0;
	int l=0;
	private int evaluate(Node value) {
		if(value==null) {
			h--;
			l--;
			return 0;
		}
			
		evaluate(value.left);
		evaluate(value.right);
		
		
		return h;
		
	}
	public static void main(String[] args) {
		Trees t = new Trees();
		t.root = new Node(5);
		t.root.left=new Node(4);
		t.root.right=new Node(6);
		t.root.left.right=new Node(8);
		t.root.right.left=new Node(2);
		t.root.left.left=new Node(1);
		t.root.right.right=new Node(9);
		t.root.left.left.left=new Node(11);
		t.evaluate(root);
				
	}


	
}
