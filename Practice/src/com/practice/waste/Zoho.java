package com.practice.waste;

public class Zoho {
	
	public static void main(String[] args) {
		Zoho z=new Zoho();
		int a[]= {6,11,15,19};
		int s=4;
		int sum=50;
		z.format(a,s,sum);
	}

	private void format(int[] a, int s, int sum) {
		int diff[] = new int[3];
		int s1=0;
		int in=1;
		for (int i = 0; i < a.length-1; i++) {
			diff[i]=Math.abs(a[i]-a[in]);
			s1=s1+a[i];
			in++;
			
		}
		int l=1;
		for (int i = 0; i < diff.length-1; i++) {
			if(diff[i]==diff[l]) {
				
			}
			else {
				System.out.println("diff are not same");
			}
			l++;
		}
	}

}
