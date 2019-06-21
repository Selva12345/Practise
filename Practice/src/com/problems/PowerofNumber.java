package com.problems;

public class PowerofNumber {
	//Without using multiplication interview Question
		public static void main(String args[]){
		int a = 4;
		int b = 5;

		System.out.println(pow(a, b));
		}

		public static int pow(int a, int b){
		//solve here
		int p=0;
		if(b==0){
		return 1;
		}

		int value=pow(a,b-1);
		for(int i=0;i<a;i++){
		p+=value;
		}
		return p;


		}

		}
