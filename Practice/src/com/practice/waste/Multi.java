package com.practice.waste;

class Multi implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
	Multi m1=new Multi();  
Thread t1 =new Thread(m1,"selva");  
t1.start();  
System.out.println(t1.getName());
 }  
}   