package bean;

public class MaxPointsYouObtainfromCardsMeth_2 {
	private static int fun(int []cardPoints,int k) {
		   int n=cardPoints.length;
		     if(k==n) {
		    	 int sum=0;
		    	 for(int i=0;i<n;i++) {
		    		 sum=sum+cardPoints[i];
		    	 }
		    	 return sum;
		     }
		    int  lsum,rsum,res;
		    lsum=0;res=0;rsum=0;
		    for(int i=0;i<k;i++) {
		    	lsum=lsum+cardPoints[i];
		    }
		    res=lsum;
		    for(int i=0;i<k;i++) {
		    	   lsum=lsum-cardPoints[k-1-i];
		    	   rsum=rsum+cardPoints[n-1-i];
		    	 res=Math.max(res,lsum+rsum);
		    	 
		    }
		return res;
	}
	public static void main(String[] args) {
		int []nums= {1,2,3,4,5,6,1};
		int k=3;
		System.out.println(fun(nums,k));

	}

}
