package bean;

import java.util.LinkedHashMap;

public class LRUcache {
	LinkedHashMap<Integer,Integer>map;
	int size;
	 public LRUcache(int capacity) {
	        size=capacity;
	        map=new LinkedHashMap<Integer,Integer>();
	    }
	    
	    public int get(int key) {
	        if(map.containsKey(key)) {
	          int temp=map.get(key);
	          map.remove(key);
	          map.put(key, temp);
	          return temp;
	        }
	        return -1;
	    }
	    
	    public void put(int key, int value) {
	        if(map.containsKey(key)) {
	        	map.remove(key);
	        	map.put(key, value);
	        }
	        else if(map.size()==size) {
	        	map.remove(map.keySet().iterator().next());
	        	map.put(key, value);
	        }
	    }
	public static void main(String[] args) {
		

	}

}
