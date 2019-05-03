package com.rebirth;

public class Reverse {
	public static void main(String[] args) {
		String s="A man, in the boat says : I see 1-2-3 in the sky";
		
		StringBuffer s1=new StringBuffer(s);
		reverseString(s1,s);
	}

	private static void reverseString(StringBuffer s1,String s) {
		s1.reverse();
		int j=0;
		System.out.println(s1);
		System.out.println(s);
		String s2=s1.toString();
		char a[]=s2.toCharArray();
		char b[]=s.toCharArray();
		int l=b.length;
		for (int i = 0; i < b.length; i++) {
			if(b[i]!=' '&Character.isLetterOrDigit(b[i])) {
				if(Character.isLetterOrDigit(a[j])||Character.isSpace(a[j])) {
					if(!Character.isSpace(a[j])) {
					System.out.print(a[j]);
					j++;
					}
					else {
						int m=j;
						while(j==m){
							j++;
							m=j;
							if(Character.isLetterOrDigit(a[j])) {
							
							System.out.print(a[j]);
							j++;
							
							}
							
						}
						
					}
					
				
				}else {
					j++;
					System.out.print(a[j]);
					j++;
				}
				
			}else {
				System.out.print(b[i]);
				
				
			}
			
		}
		
	}

}
