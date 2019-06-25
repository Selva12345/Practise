package com.rebirth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NewCompare {
	// NOTE: caps and small letters will compared in different ways
	public static void main(String[] args) {
		List<obj> li=new ArrayList<>();
		li.add(new obj("PaulWalker","24","Porsche","Audi"));
		li.add(new obj("DavidBeckham","25","VolksWagen","Maruthi"));
		li.add(new obj("FratPitt","7","Nissan","Skyline"));
values v=new values();
		Collections.sort(li,v);
		for (obj obj : li) {
System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getCar());

		}

	}
	

	
}
class obj implements Comparable<obj>{
	String name;
	String id;
	String car;
	String brand;
	@Override
	public int compareTo(obj com) {
		//System.out.println("Sleep");

		return com.getName().compareTo(this.name); 
	}
	

	public obj(String name, String id, String car, String brand) {
		this.name = name;
		this.id = id;
		this.car = car;
		this.brand = brand;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
 class comparison implements Comparable<obj> {

	@Override
	public int compareTo(obj arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class values implements Comparator<obj>{

	

	@Override
	public int compare(obj arg0, obj arg1) {
		return arg0.getName().compareTo(arg1.getName()); 
	}
	
}