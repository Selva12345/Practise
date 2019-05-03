package com.practice.waste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Split {
	public static void main(String args[]) {
		String str ="/\r\n"+ 
				" ITEM/TKT NBR PREV VOIDED\r\n" + 
				">+\r\n" + 
				"";
        String [] arrOfStr = str.split("/",2);
 
       
            System.out.println(arrOfStr[1]);

	}
}