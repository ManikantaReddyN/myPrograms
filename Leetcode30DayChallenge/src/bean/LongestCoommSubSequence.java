package bean;

public class LongestCoommSubSequence {
	private static int fun(String text1,String text2) {
        int m,n,res=0;
        m=text1.length();n=text2.length();
        if(m>=n) {
       	     int [][]a=new int[n+1][m+1];
       	     for(int i=0;i<m+1;i++) {
       	    	 a[0][i]=0;
       	     }
       	     for(int i=0;i<n+1;i++) {
       	    	 a[i][0]=0;
       	     }
       	     for(int i=0;i<n;i++) {
       	    	 for(int j=0;j<m;j++) {
       	    		 if(text2.charAt(i)==text1.charAt(j)) {
       	    			 a[i+1][j+1]=Math.max(a[i][j+1],a[i+1][j])+1;
       	    		 }else {
       	    			 a[i+1][j+1]=Math.max(a[i][j+1],a[i+1][j]);
       	    		 }
       	    	 }
       	     }
       	     res=a[n][m];
        }else {
       	 int [][]a=new int[m+1][n+1];
   	     for(int i=0;i<n+1;i++) {
   	    	 a[0][i]=0;
   	     }
   	     for(int i=0;i<m+1;i++) {
   	    	 a[i][0]=0;
   	     }
   	     for(int i=0;i<m;i++) {
   	    	 for(int j=0;j<n;j++) {
   	    		 if(text1.charAt(i)==text2.charAt(j)) {
   	    			 a[i+1][j+1]=a[i][j]+1;
   	    		 }else {
   	    			 a[i+1][j+1]=Math.max(a[i][j+1],a[i+1][j]);
   	    		 }
   	    	 }
   	     }
   	     res=a[m][n];
        }
return res;
}
	public static void main(String[] args) {
		String text1="abcde",text2="ace";
		System.out.println(fun(text1,text2));

	}

}
