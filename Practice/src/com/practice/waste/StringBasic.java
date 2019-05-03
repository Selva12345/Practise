package com.practice.waste;

import java.util.HashMap;

public class StringBasic {
	private void check() {
		try {
			StringBuffer s5=new StringBuffer("counting1");
			
		String s1=new String("counting1");
		String s2=new String("counting1");
		String s3="counting1";
		String s4="counting1";
		System.out.println(s5);
		if(s1==s2)
			System.out.println("success");
		
		}catch(Exception exception) {
			System.out.println("stars");
			
		}
		finally {
			System.out.println("No way");
		}

	}

	public static void main(String[] args) {
		StringBasic stringBasic=new StringBasic();
		stringBasic.check();
		HashMap<Integer,String> h1=new HashMap<>();	
		}

	
}
