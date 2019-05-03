package com.practice.waste;

public class Basic {
	int recursion(int s) {
		System.out.println("Hi Hello: "+s);
		s--;
		if(s==0)
			return 1;
		
		int m=recursion(s);
		System.out.println("s printed");
		int r=recursion(s);
		System.out.println("r: "+r);
		System.out.println("m: "+m);
		if(m==r)
		return 0;
		else
			return 1;
			
		
	}
public static void main(String[] args) {
	Basic b=new Basic();
	b.recursion(3);
	
}
}
