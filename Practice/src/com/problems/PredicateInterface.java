package com.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateInterface {

	public static void main(String[] args) {
		PredicateInterface pi = new PredicateInterface();
		pi.call();
	}

	caller c = cv -> {
		cv = cv + " hello";
		return cv;
	};

	private void call() {
		Map<Integer, String> m = new HashMap<Integer, String>();
		Map<Integer, String> s = new HashMap<Integer, String>();
		List<String> li = new ArrayList<String>();
		li.add("Paul Walker");
		li.add("Beckham");
		li.add("Brat pitt");

		m.put(1, "Paul Walker");
		m.put(2, "Beckhamr");
		m.put(1, "Brat pitt");

		li.stream().map(a->a+a).collect(Collectors.toList());
		List<String> pop = new ArrayList<String>();

		System.out.println(c.fun("Dude "));
		li.stream().filter(name()).forEach(good());

		// li.stream().flatMap(p->p.to);
	}

	private Predicate<? super String> name() {

		Predicate<String> p = d -> d.contains("Brat");

		return p;

	}

	public Consumer<? super String> good() {
		Consumer<String> p = d -> {
			d = d + " Funny";
			System.out.println(d);
		};

		return p;

	}

}
