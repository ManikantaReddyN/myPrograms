package contest188;

import java.util.ArrayList;
import java.util.List;

public class BuildArraywithStackOperations {
private static List<String> fun(int []target,int n){
	List<String>list=new ArrayList<String>();
	    int j=0;
	    for(int i=1;i<=n;i++) {
	    	 if(i==target[j]) {
	    		 list.add("push");
	    		 j++;
	    	 }
	    	 else {
	    		 list.add("push");
	    		 list.add("pop");
	    	 }
	    	 if(j==target.length)
	    		 break;
	    }
	return list;
}
	public static void main(String[] args) {
		int []target= {1,3};
		int n=4;
		System.out.println(fun(target,n));

	}

}
