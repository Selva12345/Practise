package com.rebirth;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Supplier;

public class CompletableFutureThread implements Supplier<Integer>  {

	    @Override
	    public Integer get() {
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            //Do nothing
	        }
	        return 1;
	    }

	/**
	* A (pure) function that adds one to a given Integer
	**/
	public static class PlusOne implements Function<Integer, Integer> {

	    @Override
	    public Integer apply(Integer x) {
	        return x + 1;
	    }
	}

	public static void main(String[] args) throws Exception {
	    ExecutorService exec = Executors.newSingleThreadExecutor();
	    CompletableFuture<Integer> f = CompletableFuture.supplyAsync(new CompletableFutureThread(), exec);
	    System.out.println(f.isDone()); // False
	    CompletableFuture<Integer> f2 = f.thenApply(new PlusOne());
	    System.out.println(f2.get()); // Waits until the "calculation" is done, then prints 2
	}
}
