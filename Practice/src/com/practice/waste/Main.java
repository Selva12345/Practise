package com.practice.waste;

class Person 
{ 
    private static void who()
    {
        System.out.println("Inside private method Person(who)");
    }
  
    public static void whoAmI()
    {
        System.out.println("Inside static method, Person(whoAmI)");
    }
  
    public static void whoAreYou()
    {
        who();
        System.out.println("Inside virtual method, Person(whoAreYou)");
    }
}
 
class Kid extends Person
{ 
    private static void who()
    {
        System.out.println("Kid(who)");
    }
  
    public static void whoAmI()
    {
        System.out.println("Kid(whoAmI)");
    }
  
    public static void whoAreYou()
    {
        who();
        System.out.println("Kid(whoAreYou)");
    }
}
public class Main
{
    public static void main(String args[]) 
    {
        Kid p = new Kid();  
        p.whoAmI(); 
        p.whoAreYou(); 
    }
}