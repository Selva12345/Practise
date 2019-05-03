package com.practice.waste;

public class RepeatedNumber {
	
	public static void main(String[] args) {
		RepeatedNumber repeatedNumber=new RepeatedNumber();
		int a[]= {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
		repeatedNumber.check(a);
		
	}

	private void check(int[] a) {
		int b[]= a;
		int h=0;
		int k=0;
		for (int i = 0; i < b.length; i++) {
			if(b[i]>0) {
				for (int j = 1; j < b.length; j++) {
					if(b[i]==b[j]& (i!=j)) {
						//k=b
						b[i]=b[i]+b[j];
;						
						b[j]=0;
						i++;
					}
					
				}
			}
			
		}
		int len=b.length;
		int c[]= new int[len];
		
		for (int i=0;i<len;i++) {
			if(b[i]>0) {
				c[k]=b[i];
				k++;
				
			}

		}
		for (int i : c) {
			System.out.print(i+" ");
		}
		
	}

}
