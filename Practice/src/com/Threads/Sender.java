package com.Threads;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {
    private ThreadData data;
  
    // standard constructors
  
    public Sender(ThreadData data2) {
    	this.data=data2;
	}

	public void run() {
        String packets[] = {
          "First packet",
          "Second packet",
          "Third packet",
          "Fourth packet",
          "End"
        };
  
        for (String packet : packets) {
            data.send(packet);
 
            // Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
                System.out.println("Thread interrupted "+e.getMessage()); 
            }
        }
    }
}