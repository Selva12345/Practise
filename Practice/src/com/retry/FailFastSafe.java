package com.retry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastSafe {
public static void main(String[] args) throws CloneNotSupportedException {
	FailFastSafe ff=new FailFastSafe();
	Map<String, String> cityCode = new HashMap<String, String>(); 
    cityCode.put("Delhi", "India"); 
    cityCode.put("Moscow", "Russia"); 
    cityCode.put("New York", "USA"); 

    Iterator<String> iterator = cityCode.keySet().iterator(); 
    while (iterator.hasNext()) { 
        System.out.println(cityCode.get(iterator.next())); 

        // adding an element to Map 
        // exception will be thrown on next call 
        // of next() method. 
        
        //Fail Fast
       // cityCode.put("Istanbul", "Turkey"); 
    }
    //=======================test
List<Integer> al = new CopyOnWriteArrayList<>(); 
    al.add(1); 
    al.add(2); 
    al.add(3); 
    al.add(4); 
    al.add(5); 
for (Integer integer : al) {
	al.add(8);
	System.out.println(integer);
	

}
Set<String> st=cityCode.keySet();
for (Map.Entry<String,String> fr: cityCode.entrySet()) {
	
	cityCode.put("Istanbul", "Turkey");
}



}
}
