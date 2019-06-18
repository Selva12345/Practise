package com.retry;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFinder {
public DateFinder(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	Calendar calendar = Calendar.getInstance();
	DateFinder df=new DateFinder(10,1,2018);
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
	System.out.println(formatter.format(calendar. getTimeInMillis()));
}
}
