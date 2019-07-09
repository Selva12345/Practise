package com.retry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FuntionalInter {
public static void main(String[] args) {
	List<String> li=new ArrayList<String>();
	li.add("Hello");
	li.add("Paul Walker");
	li.add("Go slow");
	li.add("Hello");
	Predicate<String> p=s->
	 s.equals("Hello");

	Stream<String> st = li.stream().filter(check());
Map<String,String> d=li.stream().distinct().map(s->s+s).collect(Collectors.toMap(Function.identity(),s->s));
	d.forEach((s1,s2)->System.out.println(s1+" : "+s2));
}
public static  Predicate<String> check(){
	return p->p.equals("Hello")||p.contains("Go");
}
public static Predicate<String> checkValue(){
	return p->p.equals("Paul")||p.contains("Paul");
}
}
