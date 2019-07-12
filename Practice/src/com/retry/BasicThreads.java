package com.retry;

import java.util.Iterator;

import com.practice.waste.Threads;

public class BasicThreads {
	
public static void main(String[] args) throws InterruptedException {
	Fun f=new Fun();
	Thread t=new Thread(f);
	Thread t1=new Thread(f);
	t.setPriority(Thread.MIN_PRIORITY);
	t.start();
	t.join();
	t1.start();
	//t.setDaemon(true);
	
//	BasicThreads bt=new BasicThreads();
	
		
}
}
class Fun implements Runnable{

	public void run(){ 
		
		try {
			Thread.currentThread().interrupt();
			Thread.sleep(500);
			
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			
				
		Thread.currentThread().getState();
		System.out.println("thread is running..."+ 	Thread.currentThread().getPriority()); 
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getState());
		} 
	
		
	}
	
