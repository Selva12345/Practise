package com.rebirth;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sorted {
public static void main(String[] args) {
	LinkedHashSet<String> lnk=new LinkedHashSet<>();
	lnk.add("hello");
	lnk.add("ABC");
	lnk.add("BDs");
	lnk.add("hello");
System.out.println(lnk);
	Set<String> ste=new HashSet<>();
	ste.add("hello");
	ste.add("ABC");
	ste.add("BDs");
	ste.add("hello");
	System.out.println(ste);
	for (String string : ste) {
		
	}
	TreeSet<String> st=new TreeSet <>();
	st.add("hello");
	st.add("ABC");
	st.add("BDs");
	st.add("hello");
	System.out.println(st);
	Map<String,String> mp=new HashMap<>();
	mp.put("abc","Selva");
	mp.put("ABC","Paul");
	mp.put("d","David");
	System.out.println(mp);
	
}
}
