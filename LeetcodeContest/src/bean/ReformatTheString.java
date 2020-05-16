package bean;

import java.util.Stack;

public class ReformatTheString {
  private static String fun(String s) {
	       int n=s.length();
	       Stack<Character>a=new Stack<>();
	       Stack<Character>b=new Stack<>();
	       char []arr=new char[n];
	       int c=0,d=0;
	       for(int i=0;i<n;i++) {
	    	   if(s.charAt(i)>=97 && s.charAt(i)<=122)
	    		   c++;
	    	   else
	    		   d++;
	       }  
	         System.out.println(c+" "+d);
	       int j;
	          if(c==d || c-d==-1 || c-d==1) {
	        	  
	        	  for(int i=0;i<n;i++) {
	   	    	   if(s.charAt(i)>=97 && s.charAt(i)<=122)
	   	    		   a.add(s.charAt(i));
	   	    	   else
	   	    		   b.add(s.charAt(i));
	   	    	   
	   	       }if(c>d) {
	        	  j=0;
	        	  while(a.empty()==false && j<n) {
	        		   arr[j]=a.pop();
	        		   j=j+2;
	        	  }
	        	  j=1;
	        	  while(b.empty()==false  && j<n) {
	        		   arr[j]=b.pop();
	        		   j=j+2;
	        	  }
	   	       }else {
	   	    	j=0;
	        	  while(b.empty()==false && j<n) {
	        		   arr[j]=b.pop();
	        		   j=j+2;
	        	  }
	        	  j=1;
	        	  while(a.empty()==false  && j<n) {
	        		   arr[j]=a.pop();
	        		   j=j+2;
	        	  }
	   	       }
	          }else
	        	  return "";
	          
	          String st=new String(arr);
	  return st;
  }
	public static void main(String[] args) {
		String s="ab321";
         System.out.println(fun(s));
	}

}
