package com.problems;

import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Using java 1.8
public class JavaEight {
	public static void main(String[] args) {
		
		int a[] = { 2, 9, 3, 8, 4, 1, 6 };
		List<Integer> li = new ArrayList<>();
		li.add(7);
		li.add(3);
		li.add(1);
		li.add(9);
		Arrays.sort(a);
		int i = 0;
		// li.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		Collections.sort(li, Comparator.reverseOrder());
		// Collections.reverse(li);
		System.out.println(li);
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("PaulWalker");
		list.add("Go");
		list.add("Slow");
		list.add("People");
		list.add("Waiting");

		Predicate<String> p = s -> s.startsWith("G");
		Check c = s -> {
			String f = "Hello";
			return s.concat(f);
		};
		c.say("food");
		list.stream().filter(p).forEach(s -> System.out.println(s));
		//exceptional List<Integer>lil=Stream.iterate(9,l1->l1).collect(Collectors.toList());
		
		Iterator<Integer> f = li.stream()
				.filter(JavaEight::isGreaterThan3)
				.map(l -> l * l)
				.iterator();
		f.forEachRemaining(p1->System.out.println(p1));
		System.out.println(f);
Map<String,String> mpper=	list.stream().map(m->(m+m)).collect(Collectors.toMap(Function.identity(),lo->lo));
		System.out.println(mpper);
	}
	

	public static boolean isGreaterThan3(int i) {
		return i > 3;
	}
}

@FunctionalInterface
interface Check {
	String say(String s);
}