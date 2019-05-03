package com.practice.waste;
import java.util.*;  

public class HashMapValue {
		 public static void main(String args[]){
			 TreeSet<String> tree=new TreeSet<>();
			 tree.add("hi");
			 tree.add("hi");
			 System.out.println("Tree"+tree);
			 ArrayList<String> arr=new ArrayList<>();
			 arr.add("selva");
			 arr.remove("selva");
			 System.err.println("ArrayList"+arr);
			 List<Integer> li=new ArrayList<>();
			 li.add(5);
			 li.add(4);
			  HashSet<String> hmt=new HashSet<String>();
			  hmt.add("hi");
			  hmt.add("ad");
			  hmt.add("ad");
      System.out.println("Hash Set"+hmt);
		  Map<Integer,String> hm=new HashMap<Integer,String>();  
		  hm.put(102,"jiva");  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(null,"Rahul"); 
		  System.out.println(hm.size()+" size hash map");
		  for(Map.Entry m:hm.entrySet()){  
			  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  
		} 
