package com.retry;

import java.util.ArrayList;
import java.util.List;

public class Cloning {
	int s;

	public static void main(String[] args) throws CloneNotSupportedException {
		idle id = new idle();
		Cloning cl = new Cloning();
		idle idn=(idle) id.clone();
		idn.x=10;
		idn.c.a=100;
		System.out.println(id.x+" "+idn.x+" "+id.c.a);
		
		

	}
}
class Test 
{ 
    int a, b; 
} 
class idle implements Cloneable {
	int x;
	int y;
	Test c = new Test();
	List<String> li=new ArrayList<>();
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
