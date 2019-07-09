package com.retry;

import java.util.Iterator;

import com.practice.waste.Threads;

public class BasicThreads {
public static void main(String[] args) throws InterruptedException {
	Fun f=new Fun();
	Thread t=new Thread(f);
	Thread t1=new Thread(f);
	t.start();
	t.join();
	t1.start();
	t.setDaemon(true);
	
		
}
}
class Fun implements Runnable{
	public void run(){ 
		Thread.currentThread().isDaemon();
				for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		Thread.currentThread().getState();
		System.out.println("thread is running..."+ 	Thread.currentThread().getState()); 
		System.out.println(Thread.currentThread().getState());
		} 
	
		
	}
	
