package com.rebirth;

public class FibSeries {
	public static void main(String[] args) {
		int n[]= {2,8,7,4,6,1055};
		findnum(n);
		
	}

	private static void findnum(int n[]) {
		
		for (int i = 0; i < n.length; i++) {
			int t=1;
			int in=0;
			int s=0;
			for (int j = 0; j <Integer.MAX_VALUE; j++) {
				
				s=t+in;
				in=t;
				t=s;
				if(n[i]==s) {
				System.out.print(n[i]+" ");
				break;
				}
				if(n[i]<s) {
					break;
					}
			}
		}
		
	}

}
