package com.rebirth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class RepeatedNumbers {
public static void main(String[] args) {
	Integer arr[]={3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};
	repeat(arr);
}

private static void repeat(Integer[] arr) {
	List<Integer> li=new ArrayList<>(Arrays.asList(arr));
	ArrayList ar=new ArrayList();
	int temp=0;
	int value=0;
	
	//IntStream in=IntStream.of(5,2,5,6,9);
	
	//System.out.println(in.distinct().count());
for (int i = 0; i < arr.length; i++) {
	int n=1;
	for (int j = i+1; j < arr.length; j++) {
		if(arr[i]==arr[j]) {
			n++;
			
		}
		if(n>temp) {
			temp=n;
			value=arr[i];
		}
	}
}	
System.out.println(value);
int k=0;
List<Integer> list=new ArrayList<>(li);
for (Integer object : li) {
	
	if(object==value) {
	list.remove(k);
	
	k--;
	}
	k++;
}
//Integer[] d=list.toArray();
//repeat(d);
}
}
