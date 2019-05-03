package com.rebirth;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureKey implements Callable<Integer>  {
	

	    @Override
	    public Integer call() throws Exception {
	        Thread.sleep(1000);
	        return 1;
	    }

	

	public static void main(String[] args) throws Exception{
	    ExecutorService exec = Executors.newSingleThreadExecutor();
	    Future<Integer> f = exec.submit(new FutureKey());

	    System.out.println(f.isDone()); //False

	    System.out.println(f.get()+"END"); //Waits until the task is done, then prints 1
	}
}
