package com.rebirth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaEight {
	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("Hello");
		li.add("Paul Walker");
		li.add("Her is your");
		li.add("New Car");
		for (int i = 0; i < li.size(); i++) {
			li.get(1);

		}

		Optional<String> lil = li.stream().filter(s -> s.contains("Paul Walker")).findAny();
		System.out.println(lil.get());
	//	Stream.of(1, "Two", "Three", "Four").forEach(System.out::println);
		Map<String, String> mp = new HashMap<String, String>();
		mp.put("one", "Downey");
		mp.put("two", "Chris");
		mp.put("Three", "Dhoni");
		for (Entry<String, String> string : mp.entrySet()) {
			//System.out.println(string.getKey() + " " + string.getValue());
		}
		Iterator<String> itr=mp.keySet().iterator();
		Iterator<String> itr1=mp.keySet().iterator();

		
		while(itr.hasNext()) {
			String s=itr.next();
			//System.out.println(""+s+" "+mp.get(s));
			
		}
		List<String> lie=new ArrayList<>();
		mp.forEach((s1,s2)->{
			lie.add("");
		System.out.println(s1+" "+s2);	
		});
	}

}
