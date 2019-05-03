package com.practice.waste;

public class LetterCount {
	public static void main(String[] args) {
		String s="Msisissipi";
		StringBuffer s1= new StringBuffer(s);
		s1.reverse();
		String s2=s1.toString();
		count(s);
	}

	private static void count(String s) {
		char c[]=s.toCharArray();
		int r=Integer.MAX_VALUE;
		int v=0;
		char c1 = 0;
		int newn=0;
		for (int i = 0; i < c.length; i++) {
			int n=1;
			
			for (int j = i+1; j < c.length; j++) {
				
				if(c[i]==c[j]) {
					n++;
					
					if(n>newn||n==newn) {
						newn=n;
						int t=s.lastIndexOf(c[i]);
					
						if(t<r) {
						r=t;	
						c1=c[i];
						}
					}
					
				
				}
				
			}
			v=newn;
		}
		System.out.println(c1+"-"+v+" times");
	}

}
