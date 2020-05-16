package bean;
/*
 * Given a string s of zeros and ones, return the maximum score after splitting the 
 * string into two non-empty substrings
 *  (i.e. left substring and right substring).

The score after splitting a string is the number of zeros in the left substring plus 
the number of ones in the right substring
 */
public class MaxScoreAfterSplitString {
	private static int count(char a[],char b[]) {
		int m=a.length;
		int p=0,q=0,n=b.length;
		for(int i=0;i<m;i++) {
			if(a[i]=='0')
				p++;
		}
		for(int i=0;i<n;i++) {
			if(b[i]=='1')
				q++;
		}
		return p+q;
	}
private static int fun(String s) {
	int n=s.length();
	int res,max;
	max=0;
	  for(int i=0;i<n-1;i++) {
		   char a[]=new char[i+1];
		   char b[]=new char[n-1-i];
		   int index=0;
		   for(int j=0;j<=i;j++) {
			   a[index]=s.charAt(j);
			   index++;
		   }
		   index=0;
		   for(int j=i+1;j<n;j++) {
			   b[index]=s.charAt(j);
			   index++;
		   }
		   res=count(a,b);
		   if(max<res)
			   max=res;
	  }
	return max;
}
	public static void main(String[] args) {
		String s="00111";
       System.out.println(fun(s));
	}

}
