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

		Checker c = new Checker();
		List<String> lo = new ArrayList<>();
		lo.add("revenge");
		Set<String> s = new HashSet<>();
		s.add("Time");
		s.add("Time");
		
		List<String> lol = Collections.synchronizedList(lo);
		System.out.println(lol);

		Map<Integer, String> mp = new LinkedHashMap<>();

		mp.put(001, "Hi");
		mp.put(50, "lets");
		mp.put(3, "Begin");
		mp.put(12, "Begin");
		mp.put(45, "Begin");
		mp.forEach((s2, s1) -> System.out.println(s2 + " " + s1));
		
		System.out.println(mp);
StringBuffer sb=new StringBuffer("Hello");
sb.insert(2," qwerty");
String s7="qwerty";
s7.concat(" Key");

System.out.println(s7);
		// System.out.println(data);
	}

	/*
	 * HashSet is Implemented using a hash table. Elements are not ordered. The add,
	 * remove, and contains methods have constant time complexity O(1).
	 * 
	 * TreeSet is implemented using a tree structure(red-black tree in algorithm
	 * book). The elements in a set are sorted, but the add, remove, and contains
	 * methods has time complexity O(log (n)). It offers several methods to deal
	 * with the ordered set like first(), last(), headSet(), tailSet(), etc.
	 * 
	 * 1) First major difference between HashSet and TreeSet is performance. HashSet
	 * is faster than TreeSet and should be preferred choice if sorting of element
	 * is not required.
	 * 
	 * 2) Second difference between HashSet and TreeSet is that HashSet allows null
	 * object but TreeSet doesn't allow null Object and throw NullPointerException,
	 * Why, because TreeSet uses compareTo() method to compare keys and compareTo()
	 * will throw java.lang.NullPointerException.
	 * 
	 * 3) Another significant difference between HashSet and TreeSet is that ,
	 * HashSet is backed by HashMap while TreeSet is backed by TreeMap in Java.
	 * 
	 * 4) One more difference between HashSet and TreeSet which is worth remembering
	 * is that HashSet uses equals() method to compare two object in Set and for
	 * detecting duplicates while TreeSet uses compareTo() method for same purpose.
	 * if equals() and compareTo() are not consistent, i.e. for two equal object
	 * equals should return true while compareTo() should return zero, than it will
	 * break contract of Set interface and will allow duplicates in Set
	 * implementations like TreeSet
	 * 
	 * 5) Now most important difference between HashSet and TreeSet is ordering.
	 * HashSet doesn't guaranteed any order while TreeSet maintains objects in
	 * Sorted order defined by either Comparable or Comparator method in Java.
	 * 
	 * 6) TreeSet does not allow to insert Heterogeneous objects. It will throw
	 * classCastException at Runtime if trying to add hetrogeneous objects, whereas
	 * HashSet allows hetrogeneous objects.
	 */
}
