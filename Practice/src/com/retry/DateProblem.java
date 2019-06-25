package com.retry;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class DateProblem {
public static void main(String[] args) {
	String s="12:10:2018";
	Date d=new Date();
	SimpleDateFormat sd=new SimpleDateFormat("dd:mm:yyy");
	String f=sd.format(d);
	d.setDate(33);
	LocalDate ld =LocalDate.now();
	
	
	System.out.println(ld.getDayOfMonth()+" : "+ld.getYear()+" : "+ld.getMonth()+" "+ld.plusDays(365));
}
}
