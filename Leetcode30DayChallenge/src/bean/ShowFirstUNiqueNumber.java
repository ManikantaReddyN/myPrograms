package bean;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShowFirstUNiqueNumber {
	LinkedHashMap<Integer,Integer>map;
	
public ShowFirstUNiqueNumber(int[] nums) {
	map=new LinkedHashMap<Integer,Integer>();
	int n=nums.length;
	for(int i=0;i<n;i++) {
		  if(map.containsKey(nums[i])) {
			  int temp=map.get(nums[i]);
			  temp++;
			  map.replace(nums[i], temp);
		  }else {
			  map.put(nums[i], 1);
		  }
	}
    }
    
    public int showFirstUnique() {
        int res=-1;
        for(Map.Entry entry:map.entrySet()){    
            int key=(int) entry.getKey();  
            int val =(int) entry.getValue();  
            if(val==1)
            	return key;
        }
        return res;
    }
    
    public void add(int value) {
    	if(map.containsKey(value)) {
			  int temp=map.get(value);
			  temp++;
			  map.replace(value, temp);
		  }else {
			  map.put(value, 1);
		  }
    }
	public static void main(String[] args) {
		int []nums= {7,7,7,7,7};
		ShowFirstUNiqueNumber obj=new ShowFirstUNiqueNumber(nums);
            System.out.println(obj.showFirstUnique());
            obj.add(2);
            System.out.println(obj.showFirstUnique());
            obj.add(3);
            System.out.println(obj.showFirstUnique());
            obj.add(5);
            System.out.println(obj.showFirstUnique());
	}

}
