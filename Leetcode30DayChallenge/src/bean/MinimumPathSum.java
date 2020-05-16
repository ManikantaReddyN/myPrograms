package bean;
/*
 * Given a m x n grid filled with non-negative numbers,
find a path from top left to bottom right which minimizes the sum of all numbers
 along its path.

Note: You can only move either down or right at any point in time.
 */
public class MinimumPathSum {
private static int fun(int [][]grid) {
	    int n,m=grid.length;
	    if(m==0)
	    	return 0;
	    n=grid[0].length;
	    if(n==0)
	    	return 0;
	    
	    for(int i=0;i<m;i++) {
	    	 for(int j=0;j<n;j++) {
	    		
	    		  if(i-1>=0 && j-1>=0) {
	    			  grid[i][j]=Math.min(grid[i][j-1],grid[i-1][j])+grid[i][j];
	    		  }
	    		  else if(i-1>=0) {
	    			  grid[i][j]=grid[i][j]+grid[i-1][j];
	    		  }
	    		  else if(j-1>=0){
	    			  grid[i][j]=grid[i][j]+grid[i][j-1];
	    		  }
	    		 
	    	 }
	    }
	return grid[m-1][n-1];
}
	public static void main(String[] args) {
		int grid[][]= {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(fun(grid));
	}

}
