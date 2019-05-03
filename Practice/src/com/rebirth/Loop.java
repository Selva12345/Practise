package com.rebirth;

import java.util.ArrayList;
import java.util.List;

public class Loop {
	public static void main(String[] args) {
		check();
	}

	private static void check() {
		String b="hi Paul Walker";
		char[] a=b.toCharArray();
		for (char c : a) {
		}
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		items.forEach(item->System.out.print(item));
		System.out.println("");
		items.forEach(System.out::print);
		System.out.println("");

		items.stream()
		.filter(s->s.contains("a"))
		.forEach(System.out::println);
		}
	}

