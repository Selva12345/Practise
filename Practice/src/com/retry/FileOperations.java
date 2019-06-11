package com.retry;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperations {

public static void main(String[] args) {
	File f=new File("D://Testing.txt");
	try {
		if(f.createNewFile())System.out.println("Success!");
		else System.out.println ("Error, file already exists.");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		FileInputStream fi=new FileInputStream("D://Testing.txt");
		fi.read();
		FileOutputStream fo=new FileOutputStream("D://Testing.txt");
		fo.write("Hello Paul Walker".getBytes());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

