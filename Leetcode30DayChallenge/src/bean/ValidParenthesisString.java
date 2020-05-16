package bean;

public class ValidParenthesisString {
  private static boolean fun(String s) {
	         int temp=0,n=s.length();
	         if(n==0)
	        	 return true;
	          for(int i=0;i<n;i++) {
	        	   if(s.charAt(i)==')')
	        		   temp--;
	        	   else
	        		   temp++;
	        	   
	        	   if(temp<0)
	        		   return false;
	          }
	          temp=0;
	          for(int i=n-1;i>=0;i--) {
	        	   if(s.charAt(i)=='(')
	        		   temp--;
	        	   else
	        		   temp++;
	        	   
	        	   if(temp<0)
	        		   return false;
	          }
	  return true;
  }
	public static void main(String[] args) {
	  String s="()";
        System.out.println(fun(s));
	}

}
