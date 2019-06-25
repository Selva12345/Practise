package com.designPattern;

 class SingletonDesignPattern {
	String s;
	final static SingletonDesignPattern sd=new SingletonDesignPattern("One Value");
private SingletonDesignPattern(String string) {
	this.s=string;
}
public static SingletonDesignPattern create() {
	return sd;
}
}
class SingletonDesign{
	public static void main(String[] args) {
		SingletonDesignPattern s1=	SingletonDesignPattern.create();
		System.out.println(s1.s);
	}
}