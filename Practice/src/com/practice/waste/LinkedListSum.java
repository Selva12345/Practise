package com.practice.waste;


public class LinkedListSum {
	static Node head1, head2, result;
	static int size1;
	static int size2;
	static int remain;
	static int itr;

	class Node {
		int val;
		Node next;

		public Node(int item) {
			val = item;
			next = null;

		}
	}

	void pull(int value, int list) {
		Node newNode = new Node(value);
		Node newNode1 = new Node(value);
		Node newNode2 = new Node(value);
		if (list == 1) {
			newNode.next = head1;
			head1 = newNode;
		}
		
		else if (list == 2) {
			newNode1.next = head2;
			head2 = newNode1;
		}
		else {
			newNode2.next = result;
				result = newNode2;
		}
		

	}
	void print() {
		Node total=result;
		while (total!= null) {
			System.out.print(total.val+" ");
			total = total.next;
		}
		
		
	}

	void count() {

		Node count = head1;
		Node count1 = head2;
		// System.out.println(temp.val);
		while (count.next != null) {
			count = count.next;
			size1++;
		}

		System.out.println("Size1: " + size1);

		while (count1.next != null) {
			count1 = count1.next;
			size2++;
		}
		System.out.println("Size2: " + size2);

	}

	void lastNode() {
		int kal = 1;
		int kal1 = 1;
		Node temp=head1;
		Node temp1=head2;
		// System.out.println(temp.val);

		if (size1 >= 0 || size2 >= 0) {
			if (size1 >= 0) {
				while (kal <= size1) {
					temp = temp.next;
					kal++;
				}
				System.out.println(temp.val);
			}
			if (size2 >= 0) {
				while (kal1 <= size2) {
					temp1 = temp1.next;
					kal1++;
				}
				System.out.println(temp1.val);
			}
			if(size1>=0&size2>=0) {
				addsamesize(temp.val,temp1.val);
			}
			else if(size1<0) {
			addsamesize(0,temp1.val);
			}
			else if(size2<0) {
			addsamesize(temp.val,0);
			}
			size1--;
			size2--;

			lastNode();
		}

	}

	void addsamesize(int n, int m) {
		
		int sum=n+m+remain;

		if(size1>size2)
			itr=size1;
		else
			itr=size2;
		
		if(itr>0) {
			 remain=sum/10;
		        sum=sum%10;	
		     itr--;   
		     System.out.println("sum: "+sum+" "+"remain: "+remain);
		     pull(sum,3);
		}
		else {
        System.out.println("sum: "+sum+" "+"remain: "+remain);
		 pull(sum,3);
		}
	}

	public static void main(String[] args) {
		int arr1[] = { 9, 9, 9 };
		int arr2[] = { 1, 8 };

		// Create first list as 9->9->9
		for (int i = arr1.length - 1; i >= 0; --i)
			new LinkedListSum().pull(arr1[i], 1);

		// Create second list as 1->8
		for (int i = arr2.length - 1; i >= 0; --i)
			new LinkedListSum().pull(arr2[i], 2);
		// new LinkedListSum().pull(556,6789);
		// new LinkedListSum().pull(5,2);
		new LinkedListSum().count();
		new LinkedListSum().lastNode();
		new LinkedListSum().print(); 

	}

}
