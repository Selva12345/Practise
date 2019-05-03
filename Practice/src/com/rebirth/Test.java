package com.rebirth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

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
	}

}
