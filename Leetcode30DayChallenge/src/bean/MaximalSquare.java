package bean;

public class MaximalSquare {
private static int fun(char [][]matrix) {
	int max,m,n;
	    m=matrix.length;
	    if(m==0)
	    	return 0;
	    n=matrix[0].length;
	    if(n==0)
	    	return 0;
	    int sol[]=new int[n];
	    int diag=matrix[0][0]=='0'? 0 :1;
	    int temp;
	   max=0;
	   for(int i=0;i<m;i++) {
		   for(int j=0;j<n;j++) {
			temp=sol[j];			  
			   if(i==0 || j==0) {
				    if(matrix[i][j]=='1') {
				    	sol[j]=1;
				    	max=Math.max(max, sol[j]);
				    }else
				    	sol[j]=0;
				  
			   }else {
				   if(matrix[i][j]=='1') {
					   sol[j]=1+Math.min(Math.min(sol[j], sol[j-1]), diag);
					   max=Math.max(max, sol[j]);
				   }
				   else
					   sol[j]=0;
			   }
			   diag=(j== n-1)? sol[0]:temp;
		   }
	   }
	   
	  
	return max*max;
}
	public static void main(String[] args) {
		char [][]matrix= {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(fun(matrix));
	}

}
