package com.difficult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public  class PayerDetails  {
	
public static void main(String[] args) {
	/*FootBall 
		fb1=new FootBall(03,"messi","barca","100$");
	FootBall	fb2=new FootBall(02,"jr neymar","barca","110$");
	FootBall	fb3=new FootBall(01,"ronaldo","barca","102$");*/
	Map<Integer,String> mp=new HashMap<>();
	mp.put(8,"one Republic");
	mp.put(9, "Arctic Monkeys");
	mp.put(10, "kooks");
	mp.put(11, "Imagine Dragons");
	/*List <FootBall> fbList=new ArrayList<>();
	fbList.add(fb1);
	fbList.add(fb2);
	fbList.add(fb3);*/
	FootBall 
	fb1=new FootBall(mp);
	Map<Integer, String> tree = new TreeMap<Integer, String>(fb1);
	tree.putAll(mp);

	for (Entry<Integer, String> entry : tree.entrySet()) {
		 System.out.println(((Entry<Integer, String>) tree).getKey()+" "+((Entry<Integer, String>) tree).getValue());
	}
	//Collections.sort(mp,new FootBall());
	/*for (FootBall footBall : fbList) {
		System.out.println(footBall.getPlayerId()+" "+footBall.getPlayerName());
	}*/
	
}
}
