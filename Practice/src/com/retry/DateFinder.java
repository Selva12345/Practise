package com.retry;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateFinder {
public DateFinder(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	Calendar calendar = Calendar.getInstance();
	DateFinder df=new DateFinder(10,1,2018);
	LocalDateTime lt=LocalDateTime.now();
	Date d=new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
	//System.out.println(formatter.format(calendar. getTimeInMillis()));
	System.out.println(d.toGMTString());
}
}
