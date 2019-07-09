package com.rebirth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<String> st=new ArrayList<>();
		st.add("1234");
		st.add("1235");
		st.add("125878");
		List<String> inte=new ArrayList<>();
		inte.add("ADT");
		inte.add("ADT");
		inte.add("CNN");

		HashMap<String, String> f= new HashMap<>();
		Iterator itrTicket = st.listIterator();
		Iterator itrPTC = inte.listIterator();
		while (itrPTC.hasNext() && itrTicket.hasNext()) {
			
			f.put(itrPTC.next().toString(), itrTicket.next().toString());

		}
		
System.out.println(f);
//Predicate<String> p = st.stream().mapToDouble(arg0); 
Stream<String> fn=inte.stream().filter(s->s.equals(""));
//inte.stream().flatMap(Collection::stream).collect(Collectors.toList());
List<List<String>> list = Arrays.asList(
		  Arrays.asList("a"),
		  Arrays.asList("b"));
System.out.println(list.stream().flatMap(Collection::stream).collect(Collectors.toList()));
	}

}
