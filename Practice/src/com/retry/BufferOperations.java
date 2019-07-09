package com.retry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;

public class BufferOperations {
public static void main(String[] args) throws Exception {
	FileWriter fw=new FileWriter("Final.txt");
	FileReader fr=new FileReader("Hello.txt");
	BufferedReader bf=new BufferedReader(fr);
}
}
 class Demos implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
