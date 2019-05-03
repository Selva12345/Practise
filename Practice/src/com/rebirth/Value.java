package com.rebirth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.management.loading.PrivateClassLoader;


class Model implements Comparable<Model>{
public Model(int num, String cost, String value) {
	super();
	this.num = num;
	this.cost = cost;
	this.value = value;
}
int num;
String cost;
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getCost() {
	return cost;
}
public void setCost(String cost) {
	this.cost = cost;
}
public String getValue() {
	return value;
}
public void setValue(String value) {
	this.value = value;
}
String value;
@Override
public int compareTo(Model arg0) {
	return this.num-arg0.num;
	 
}
}
class Value{
	public static void main(String[] args) {
		List<Model> li =new ArrayList<>();
		
		Value v=new Value();
		Model m=new Model(5,"500","low");
		Model m1=new Model(7,"400","medium");
		Model m2=new Model(2,"600","Average");
		SortedSet<String> st=new TreeSet<String>();
		st.add("Fc");
		li.add(m);
		
		li.add(m1);
		li.add(m2);
		Collections.sort(li);
		for (Model model : li) {
			System.out.println(model.getNum()+ "  "+model.getCost()+" "+model.getValue());
		}
	check ck=new check();
	Collections.sort(li,ck);
	for (Model model : li) {
		System.out.println( "  "+model.getCost()+" ");

	}
	}
	
}
class check implements Comparator<Model>{

	@Override
	public int compare(Model arg0, Model arg1) {
		return arg0.getCost().compareTo(arg1.getCost());
	
	}
	
}