package com.retry;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class EnumerationTry {
public static void main(String[] args) {
	List<String> li=new ArrayList<>();
	Hashtable<String,String> ht=new Hashtable<>();
	ht.put("Hello","1");
	ht.put("hey there","3");

	ht.put("Wats up","2");
ht.keySet();
	Enumeration<String> e=ht.elements();
	while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
	}
}
}
