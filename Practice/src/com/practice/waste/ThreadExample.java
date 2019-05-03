package com.practice.waste;

public class ThreadExample implements Runnable {
	String p = "feel alive";

	public ThreadExample(String p) {
		super();
		this.p = p;
	}

	public void run() {
		String s = "Counting stars";
		try {
			Thread.sleep(50);
			System.out.println(Thread.currentThread().getName());
			System.err.println(p);
			// System.out.println(p);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exit");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ThreadExample te = new ThreadExample("Swinging vine");
		// Thread t1=new Thread(te);
		te.start();
		ThreadExample t2 = new ThreadExample("Swinging vine");
		t2.start();

		// t1.run();

	}

	void start() {
		Thread t = new Thread(this, p);
		t.start();
	}
}
