package com.practice.waste;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Foo
{
    // SimpleDateFormat is not thread-safe, so give one to each thread
    private static final ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue()
        {
            return new SimpleDateFormat("yyyyMMdd HHmm");
        }
    };

    public String formatIt(Date date)
    {
        return formatter.get().format(date);
    }
    public static void main(String[] args) {
    	 Thread t1 = new Thread(new Task());   
         Thread t2 = new Thread();
       
        // t1.start();
         t2.start();
	}
}