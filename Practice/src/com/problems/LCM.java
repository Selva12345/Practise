package com.problems;

public class LCM {
	 static int gcd(int a, int b) 
	    { 
	    if (a == 0) 
	        return b; 
	    
	    return gcd(b % a, a);  
	    } 
	      
	    // method to return LCM of two numbers 
	    static int lcm(int a, int b) 
	    { 
	        return (a*b)/gcd(a, b); 
	    } 
	      
	    // Driver method 
	    public static void main(String[] args)  
	    { 
	        int a = 40, b = 20; 
	        System.out.println("LCM of " + a +" and " + b + " is " + lcm(a, b)); 
	        System.out.println( "GCD is "+gcd(a,b));
	    } 
}
