package com.datastructure;

import com.practice.waste.Node;

class BinarySearchTree 
{ 
    /* Class containing left and right child of current node and data value*/
  
  
    // Root of BST 
    Node root; 
  
    // Constructor 
    BinarySearchTree() 
    { 
        root = null; 
    } 
  
    // This method mainly calls deleteRec() 
    void deletedata(int data) 
    { 
        root = deleteRec(root, data); 
    } 
  
    /* A recursive function to insert a new data in BST */
    Node deleteRec(Node root, int data) 
    { 
        /* Base Case: If the tree is empty */
        if (root == null)  return root; 
  
        /* Otherwise, recur down the tree */
        if (data < root.data) 
            root.left = deleteRec(root.left, data); 
        else if (data > root.data) 
            root.right = deleteRec(root.right, data); 
  
        // if data is same as root's data, then This is the node 
        // to be deleted 
        else
        { 
            // node with only one child or no child 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
  
            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.data = minValue(root.right); 
  
            // Delete the inorder successor 
            root.right = deleteRec(root.right, root.data); 
        } 
  
        return root; 
    } 
  
    int minValue(Node root) 
    { 
        int minv = root.data; 
        while (root.left != null) 
        { 
            minv = root.left.data; 
            root = root.left; 
        } 
        return minv; 
    } 
  
    // This method mainly calls insertRec() 
    void insert(int data) 
    { 
        root = insertRec(root, data); 
    } 
  
    /* A recursive function to insert a new data in BST */
    Node insertRec(Node root, int data) 
    { 
  
        /* If the tree is empty, return a new node */
        if (root == null) 
        { 
            root = new Node(data); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (data < root.data) 
            root.left = insertRec(root.left, data); 
        else if (data > root.data) 
            root.right = insertRec(root.right, data); 
  
        /* return the (unchanged) node pointer */
        return root; 
    } 
  
    // This method mainly calls InorderRec() 
    void inorder() 
    { 
        inorderRec(root); 
    } 
  
    // A utility function to do inorder traversal of BST 
    void inorderRec(Node root) 
    { 
        if (root != null) 
        { 
            inorderRec(root.left); 
            System.out.print(root.data + " "); 
            inorderRec(root.right); 
        } 
    } 
  
    // Driver Program to test above functions 
    public static void main(String[] args) 
    { 
        BinarySearchTree td = new BinarySearchTree(); 
  
        /* Let us create following BST 
              50 
           /     \ 
          30      70 
         /  \    /  \ 
        20   40  60   80 */
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
  
        System.out.println("Inorder traversal of the given tree"); 
        td.inorder(); 
  
        System.out.println("\nDelete 20"); 
        td.deletedata(40); 
        System.out.println("Inorder traversal of the modified tree"); 
        td.inorder(); 
  
      //  System.out.println("\nDelete 30"); 
       // tree.deletedata(30); 
     //   System.out.println("Inorder traversal of the modified tree"); 
       //td.inorder(); 
  //
       // System.out.println("\nDelete 50"); 
       // td.deletedata(50); 
       // System.out.println("Inorder traversal of the modified tree"); 
       // td.inorder(); 
    } 
} 