package bean;

public class MaxScoreAfterSplitStringMeth_2 {
private static int fun(String s) {
	int max=0;
	int p,q,n=s.length();
	p=0;
	  for(int i=0;i<n;i++) {
		  if(s.charAt(i)=='1')
			  p++;
	  }
	  q=0;
	  for(int i=0;i<n-1;i++) {
		  if(s.charAt(i)=='0')
			  q++;
		  else
			  p--;
		  max=Math.max(max,p+q);
	  }
	return max;
}
	public static void main(String[] args) {
	String s="011101";
   System.out.println(fun(s));
	}

}
