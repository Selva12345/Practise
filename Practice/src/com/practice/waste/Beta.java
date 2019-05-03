package com.practice.waste;
 
public class Beta 
{
	 public static void main(String[] args)
	 
	    {
	        String s1 = new String("Java is worst");
	        String s2 = "s";
	        s1.concat(s2);
	        String[] l=s1.split(" ");
	      System.out.println(s1);
	        int foundAt = s1.indexOf(s2);
	        System.out.println(foundAt);
	        
	        for(String s:l) {
	        	System.out.println(s);
	        	
	        	
	    }
	        }
	    }
