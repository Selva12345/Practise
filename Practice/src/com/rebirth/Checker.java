package com.rebirth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Checker {
	static int data;
	
	public static void main(String[] args) {
		
		Checker c=new Checker();
		
		List<String> lo=new ArrayList<>();
		lo.add("revenge");
		Set<String> s=new HashSet<>();
		s.add("Time");
		s.add("Time");
		List<String> lol=Collections.synchronizedList(lo);
		
     System.out.println(lol);
		
		Map<Integer, String> mp=new LinkedHashMap<>();
		
		mp.put(001,"Hi");
		mp.put(50,"lets");
		mp.put(3,"Begin");
		mp.put(12,"Begin");
		mp.put(45,"Begin");
		System.out.println(mp);
		
		
		
		//System.out.println(data);
	}

}
