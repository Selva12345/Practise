package com.retry;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class Serialization {
	public static void main(String[] args) {
		TestDemo td=new TestDemo(1, "Hello Paul");
		//File f1=new File("D://Test.txt");
		try {
			FileOutputStream fo=new FileOutputStream("D://TestNew.txt");
			ObjectOutputStream obj=new ObjectOutputStream(fo);
			//obj.defaultWriteObject();	
			obj.writeObject(td);
			fo.close();
			obj.close();
			//obj.writeBytes("Hello Rockstar");
		} catch (Exception e) {
			System.out.println("IOException is caught"); 		}
		try {
			FileInputStream foe=new FileInputStream("D://TestNew.txt");
			ObjectInputStream obj=new ObjectInputStream(foe);
			//obj.defaultWriteObject();	
			TestDemo tsd=(TestDemo) obj.readObject();
			foe.close();
			obj.close();
			 System.out.println("a = " + tsd.a); 
	            System.out.println("b = " + tsd.b);
			//obj.writeBytes("Hello Rockstar");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("IOException is caught"); 
		}
	}
	}


class TestDemo implements Serializable {
	 public int a; 
	    public String b;
		public TestDemo(int a, String b) {
			this.a = a;
			this.b = b;
		} 
}
