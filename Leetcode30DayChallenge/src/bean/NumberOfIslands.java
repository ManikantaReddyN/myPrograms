package bean;

public class NumberOfIslands {
	private static void check(char [][]grid,int i,int j) {
		int n=grid.length,m=grid[0].length;
		        grid[i][j]='0';
		        if(i+1<n && grid[i+1][j]=='1')
		        	 check(grid,i+1,j);
		        if(i-1>=0 && grid[i-1][j]=='1')
		        	 check(grid,i-1,j);
		        if(j+1<m && grid[i][j+1]=='1')
		        	 check(grid,i,j+1);
		        if(j-1>=0 && grid[i][j-1]=='1')
		        	 check(grid,i,j-1);
		
	}
  private static int fun(char [][]grid) {
	       int count,n=grid.length;
	       if(n==0)
	    	   return 0;
	       int m=grid[0].length;
	       	  if(m==0)
	    	   return 0;
	       count=0;
	         for(int i=0;i<n;i++) {
	        	 for(int j=0;j<m;j++) {
	        		 if(grid[i][j]=='1') {
	        			 count++;
	        			 check(grid,i,j);
	        		 }
	        	 }
	         }
	  return count;
  }
	public static void main(String[] args) {
		char [][]grid= {{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','0','0','0'}};
		System.out.println(fun(grid));

	}

}
