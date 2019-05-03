package com.practice.waste;

import java.util.ArrayList;
import java.util.Collections;

public class MainComparable {
	 public static void main(String[] args)
	 {
	     ArrayList<Movie> list = new ArrayList<Movie>();
	     list.add(new Movie("Force Awakens", 8.3, 2015));
	     list.add(new Movie("Star Wars", 8.7, 1977));
	     list.add(new Movie("Empire Strikes Back", 8.8, 1980));
	     list.add(new Movie("Return of the Jedi", 8.4, 1983));

	     Collections.sort(list);

	     System.out.println("Movies after sorting : ");
	     for (Movie movie: list)
	     {
	         System.out.println(movie.getName() + " " +
	                            movie.getRating() + " " +
	                            movie.getYear());
	     }
	     
	     System.out.println("\nSorted by name");
	        NameCompare nameCompare = new NameCompare();
	        Collections.sort(list, nameCompare);
	        for (Movie movie: list)
	            System.out.println(movie.getName() + " " +
	                               movie.getRating() + " " +
	                               movie.getYear());
	 
	        // Uses Comparable to sort by year
	        System.out.println("\nSorted by year");
	        Collections.sort(list);
	        for (Movie movie: list)
	            System.out.println(movie.getYear() + " " +
	                               movie.getRating() + " " +
	                               movie.getName()+" ");
	 }
}
