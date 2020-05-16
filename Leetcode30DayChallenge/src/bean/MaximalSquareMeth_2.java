package bean;

public class MaximalSquareMeth_2 {
private static int fun(char [][]matrix) {
	int max,m,n,cur;
	max=0;cur=0;	
    m=matrix.length;
    if(m==0)
    	return 0;
    n=matrix[0].length;
  System.out.println(m+" "+n);
    char p,q,r;
    int temp;
     for(int i=0;i<m;i++) {
    	  for(int j=0;j<n;j++) {
    		  if(i==0 || j==0) {
    			  if(matrix[i][j]=='1')
    				  cur=matrix[i][j]-'0';
    		  }
    		  else if(matrix[i][j]=='1') {
    			  p=matrix[i-1][j-1];
    			  q=matrix[i-1][j];
    			  r=matrix[i][j-1];
    			  temp=Math.min(p-'0',Math.min(q-'0',r-'0'))+1;
    			  System.out.println(temp+" "+max);
    			  if(cur<temp)
    				  cur=temp;
    			    String a=Integer.toString(temp);
    			    matrix[i][j]=a.charAt(0);
    		  }
    		  if(max<cur)
    			  max=cur;
    	  }
     }
     
       
	return max*max;
}
	public static void main(String[] args) {
		char [][]matrix= {{'1'}};

        System.out.println(fun(matrix));

	}

}
