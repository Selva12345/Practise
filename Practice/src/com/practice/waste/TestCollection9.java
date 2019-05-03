
package com.practice.waste;

import java.util.HashSet;
import java.util.Iterator;

public class TestCollection9 {
		 public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		  HashSet<String> set=new HashSet<String>();  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("zjay");  
		  //Traversing elements  
		  System.out.println(set);
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
}
