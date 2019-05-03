package com.rebirth;

public class Hash {
	String key;
	  Hash(String key)
	  {
	    this.key = key;
	  }
	  
	  @Override
	  public int hashCode() 
	  {
	     return (int)key.charAt(0);
	  }

	  @Override
	  public boolean equals(Object obj)
	  {
	    return key.equals((String)obj);
	  }
public static void main(String[] args) {
	/*int hash = 118

			  // {"vishal"} is not a string but 
			  // an object of class Key
			  Key key = {"vishal"}

			  Integer value = 20
			  Node next = null*/
	
}
}
