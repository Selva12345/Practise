package com.retry;

import java.util.Date;

public class Immutable {
public static void main(String[] args) {
	 Student s = new Student("ABC", 101); 
     System.out.println(s.getName()); 
     System.out.println(s.getRegNo()); 
     Student s1 = new Student("dcf", 102); 
     System.out.println(s1.getName()); 
     System.out.println(s1.getRegNo()); 

}
}
final class Student{
	final String name; 
	final int regNo; 
  
    public Student(String name, int regNo) 
    { 
        this.name = name; 
        this.regNo = regNo; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public int getRegNo() 
    { 
        return regNo; 
    } 	
}