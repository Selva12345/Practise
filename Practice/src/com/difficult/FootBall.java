package com.difficult;

import java.util.Comparator;
import java.util.Map;


public class FootBall<T1,T2> implements Comparator<T1> {
private int playerId;
private String playerName;
private String  team;
private String  Salary;
T2 val1;
T2 val2;
private Map<T1, T2> mp;
public FootBall(int pID,String PName) {
	
}

public  FootBall(int pID,String PName,String t,String s){
	this.playerId=pID;
	this.playerName=PName;
	this.team=t;
	
}
public FootBall(Map<T1, T2> mp) {
this.mp=mp;
}


public int getPlayerId() {
	return playerId;
}
public String getPlayerName() {
	return playerName;
}
public String getTeam() {
	return team;
}
public String getSalary() {
	return Salary;
}


@Override
public int compare(T1 t1, T1 t2) {
	// TODO Auto-generated method stub
	val1= mp.get(t1);
	val2=mp.get(t2);
	return ((String) val1).compareTo((String) val2) ;
}


}
