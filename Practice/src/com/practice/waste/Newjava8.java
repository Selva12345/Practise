package com.practice.waste;

import java.util.ArrayList;
import java.util.List;

public class Newjava8 {
	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		String s1;

		//lambda
		//Output : A,B,C,D,E
		//items.forEach(item->System.out.println(item));
			
		//Output : C
		/*items.forEach(item->{
			
				System.out.println(item);
			
		});
			
		//method reference
		//Output : A,B,C,D,E
	//	items.forEach(System.out::println);
		
		//Stream and filter
		//Output : B
		items.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::print);*/
		String country;

		List<String> cities = new ArrayList<>();
		cities.add("Delhi");
		cities.add("New York");
		cities.add("Beijing");
		cities.add("1kjh1231");

		country = cities.stream()
		                   // .filter( c -> c.equals("Beijing"))
		                    .findAny()
		                    .map(v -> "China")
		                    .orElse(null);
		//System.out.println(country);
		
		cities.forEach(c->{
			c=c.concat("Hi");
			System.out.println(c);
		});
		
	}
	
}
