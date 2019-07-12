package com.Threads;

public class MainMethod {
	public static void main(String[] args) {
	    ThreadData data = new ThreadData();
	    Thread sender = new Thread(new Sender(data));
	    Thread receiver = new Thread(new Receiver(data));
	     
	    sender.start();
	    receiver.start();
	}
}
