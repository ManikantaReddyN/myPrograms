package bean;

import java.util.HashMap;

public class SubArraySumEqualsMeth_2 {
private static int fun(int []nums,int k) {
	    int n=nums.length;
	    if(n==0)
	    	return 0;
	      HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
	      int cursum,temp,count=0;
	      temp=0;
	      cursum=0;
	      for(int i=0;i<n;i++) {
	    	  cursum=cursum+nums[i];
	    	  if(cursum==k)
	    		  count++;
	    	  
	    	  temp=cursum-k;
		      if(map.containsKey(temp))
		    	  count=count+map.get(temp);
		      
	    	  if(map.containsKey(cursum)){
	    		  temp=map.get(cursum);
	    		  temp++;
	    		  map.replace(cursum, temp);
	    	  }else
	    		  map.put(cursum, 1);
	    	  
	    	  
	      }
	return count;
}
	public static void main(String[] args) {
		int []nums= {1};
		int k=0;
    System.out.println(fun(nums,k));
	}

}
