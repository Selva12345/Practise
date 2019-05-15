package com.rebirth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Idea {
	public void finalize() {
		System.out.println("Garbage");

	}
	public static void main(String[] args) {
		Collection<String> s2=new ArrayList<>();

		Idea id =new Idea();
		Idea id1 =new Idea();
		id1=null;
		id=null;
		
		
		s2.add("Hello");
		s2.add("Pirate");
		s2.add("We are here ");
		s2.add("Jack sparrow");
		String r=null;
		s2.forEach((s->
		{
			System.out.println(s+" ");
		}
		));
		
		for (String string : s2) {
			//System.out.print(string+" ");
			r="gfhg";
		}
		Iterator<String> i1=s2.iterator();
		while(i1.hasNext()) {
			//System.out.print(i1.next()+" ");
			
		}
		System.gc();	
	}

}
