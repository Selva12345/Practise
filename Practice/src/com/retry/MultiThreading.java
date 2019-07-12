package com.retry;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.practice.waste.Threads;

public class MultiThreading {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex=Executors.newFixedThreadPool(5);
		ex.execute(new Runnable() {
			
			@Override
			public void run() {
System.out.println("Inside here");				
			}
		});
		List<String> li=new ArrayList<String>();
	Idea  c= new Idea(1, "hello");
	c=new Idea(3,"gr");
	
	
		for (int i = 0; i <3; i++) {
		 c= new Idea(1, "hello");
			Future<String> ft=ex.submit(c);
			li.add(ft.get());
		}
		System.out.println(li);
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Idea implements Callable<String> {
	int s;
	String d;

	public Idea(int s, String d) {
		this.s = s;
		this.d = d;
	}

	@Override
	public String call() throws Exception {

		return d;
	}

}
