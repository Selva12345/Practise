package com.revist.rebirth;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Match  {

	
public static void main(String[] args) {
	Match m=new Match();
	FootBall fb=(String s)->s+" madam";
	FootBall fb1=(String s1)->s1+" ithellam over";
	String b=fb.points("Brindha ");
	String f=fb1.points("helloooooooo");
	System.out.println(b+"  "+f);
	
	Map<String ,String> mp=new HashMap<>();
	mp.put("Football","Beckham");
	mp.put("Cricket", "Dhoni");
	mp.put("Tripchange","Paul Milradt");
	mp.forEach((s1,s2)->System.out.println(s1+" "+s2));
	FootBall fb2=(s3)->{
		System.out.println(s3+"Hello" + hi());
		return s3;
		
	};
	//FootBall fv=s->m.pointsw(s+"good");
	System.out.println(fb2.points("sd"));
	
	System.out.println();
	
}
private  String pointsw(String s) {
	return s;
}

 static String  hi() {
	return null;
}
}
