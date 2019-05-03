package com.practice.waste;

public class Singleton {
	private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething(){
    	System.out.println("Counting Stars");
    	
    }
    private static Class getClass(String classname) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if(classLoader == null) 
            classLoader = Singleton.class.getClassLoader();
          return (classLoader.loadClass(classname));
    }
}
