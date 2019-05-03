package com.practice.waste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerial implements Serializable {
	public byte version = 100;
	public byte count = 0;
	public static void main(String args[]) throws IOException {
		FileOutputStream fos = new FileOutputStream("temp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		TestSerial ts = new TestSerial();
		oos.writeObject(ts);
		oos.flush();
		oos.close();
	}
}
