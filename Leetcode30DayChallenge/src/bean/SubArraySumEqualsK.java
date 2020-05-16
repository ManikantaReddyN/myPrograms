package bean;


/*
 * Given an array of integers and an integer k, you need to find the total number of continuous 
 * subarrays 
 *whose sum equals to k.
 */
public class SubArraySumEqualsK {
private static int fun(int []nums,int k) {
	 int count=0,n=nums.length;
     int sum=0;
       for(int i=0;i<n-1;i++) {
    	   sum=0;
    	   if(k==nums[i])
    	   count++;
    	   sum=sum+nums[i];
    	   for(int j=i+1;j<n;j++) {
    		   sum=sum+nums[j];
    		   if(sum==k)
    			   count++;
    	   }
       }
        if(nums[n-1]==k)
        	count++;
     return count; 
}
	public static void main(String[] args) {
	 int []nums= {1,2,3};
	 int k=3;
	 System.out.println(fun(nums,k));

	}

}
