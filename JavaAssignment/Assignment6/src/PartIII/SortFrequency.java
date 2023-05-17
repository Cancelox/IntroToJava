package PartIII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortFrequency {

    public static ArrayList<Integer> sortByFrequency(ArrayList<Integer> ar) {
    	HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
    	for(int i=0;i<ar.size();i++) {
    		int cur = ar.get(i);
    		if(counter.containsKey(cur)) {
    			counter.put(cur, counter.get(cur)+1);
    		}else {
    			counter.put(cur, 1);
    		}
    	}

    	counter = counter.entrySet()
    			.stream()
    			.sorted(Map.Entry.comparingByValue())
    			.collect(Collectors.toMap(
    					Map.Entry::getKey,
    					Map.Entry::getValue,
    					(oldValue, newValue) -> oldValue,
    					LinkedHashMap::new));
    	//System.out.println(counter);
    	ArrayList<Integer> ret = new ArrayList<Integer>();
    	for(Map.Entry<Integer, Integer> entry : counter.entrySet()) {
    		for(int i=0; i<entry.getValue();i++) {
    			ret.add(entry.getKey());
    		}
    	}
    	return ret;
    	
    	
            
    }
    
    public static void main(String[] args) {
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i=0;i<100;i++) {
                    ar.add((int)(Math.random()*10));                        
            }
            System.out.println(ar.toString());
            System.out.println(sortByFrequency(ar).toString());
    }
}
