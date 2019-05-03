package com.practice.waste;


public class BinaryTraversal {
	 Node root;
	private int print(Node root2) {
		if(root2==null) {
			return 0;
		}
		System.out.print(root2.data+" ");
		print(root2.left);
		return print(root2.right);
		
		
		
	}
		public static void main(String[] args) {
		BinaryTraversal traversal=new BinaryTraversal();
		traversal.root=new Node(7);
		traversal.root.left=new Node(8);
		traversal.root.right= new Node(1);
		traversal.root.left.left= new Node(6);
		traversal.root.left.right= new Node(5);
		System.out.println("print values: "); 
		
		traversal.print1();
		
	}
		public void print1() {
			//print(root);
			printValue(root);
		}
		static int value = 0;
static int i=0;
		public void printValue(Node root2) {
			if(root2==null)
				return;
			
			System.out.print(" "+root2.data);
			
			//return;
		
			
			if(i==0) {
				value++;
				i++;
			printValue(root2.left);
			}
			if(i==1 &value==1) {
				
				value++;
				return;
			}
			if(value>=1) {
				value--;
				i--;
          //System.out.println(root2.right.data); 
 
				printValue(root2.right);
			}
		}

		

}
