package bean;
/*
 * There are several cards arranged in a row, and each card has an associated number
 *  of points The points are given in the integer array cardPoints.

In one step, you can take one card from the beginning or from the end of the row.
 You have to take exactly k cards.

Your score is the sum of the points of the cards you have taken.

Given the integer array cardPoints and the integer k,
 return the maximum score you can obtain.
 */
public class MaxPointsYouObtainfromCards {
private static int fun(int []cardPoints,int k) {
	   int n=cardPoints.length;
	     if(k==n) {
	    	 int sum=0;
	    	 for(int i=0;i<n;i++) {
	    		 sum=sum+cardPoints[i];
	    	 }
	    	 return sum;
	     }
	    double sum;
	    int res;
	    sum=0;res=0;
	    for(int i=0;i<k;i++) {
	    	sum=sum+cardPoints[i];
	    }
	    res=(int) sum;
	    for(int i=n-k;i<n;i++) {
	    	  sum=0;
	    	  for(int j=0;j<k;j++) {
	    		  sum=sum+cardPoints[(i+j)%n];
	    	  }
	    	  if(res<sum)
	    		  res=(int) sum;
	    }
	return res;
}
	public static void main(String[] args) {
	int []nums= {1,2,3,4,5,6,1};
	int k=3;
	System.out.println(fun(nums,k));

	}

}
