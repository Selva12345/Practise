package com.problems;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class DateandTime {
public static void main(String[] args) {
	SimpleDateFormat sd=new SimpleDateFormat();
	Date d=new Date();
	Month m=Month.JULY;
	Set<String> id=ZoneId.getAvailableZoneIds();
	Clock c=Clock.tickMinutes(ZoneId.of("Asia/Thimbu"));
	LocalDate ld=LocalDate.of(2019, m, 19);
	LocalDateTime lt=LocalDateTime.now();
	System.out.println(ld.getYear()+"    "+lt+"  "+"  "+c);
	Calendar cal=Calendar.getInstance();
	System.out.println("  "+cal.getFirstDayOfWeek()+"  "+cal.getTime());
	cal.add(Calendar.DAY_OF_MONTH,7);
	System.out.println(cal.getFirstDayOfWeek()+" "+cal.getTime());
}
}
