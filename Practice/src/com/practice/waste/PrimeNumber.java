package com.practice.waste;

public class PrimeNumber {
	public static void main(String[] args) {
		PrimeNumber primeNumber=new PrimeNumber();
		int n=100;
		primeNumber.prime(n);
	}

	private void prime(int n) {
		for (int i = 2; i < n; i++) {
			if(i==2||i==3) {
				System.out.print(" "+i);
			}
			
			if(i>2) {
				int k=i%2;
				int l=i%3;
				if(k>=1&l>=1) {
					System.out.print(" "+i);
				}
			}
			
		}
		
	}

}
