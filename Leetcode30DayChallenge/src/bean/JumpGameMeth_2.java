package bean;

public class JumpGameMeth_2 {
private static boolean fun(int []nums) {

	int max_reach=0,n=nums.length;
	for(int i=0;i<n;i++) {
		 if(nums[i]+i>max_reach)
			 max_reach=nums[i]+i;
		 if(max_reach==i)
			 break;
	}
	if(max_reach>=n)
		return true;
	return false;
	
}
	public static void main(String[] args) {
		int []nums= {1,2,0,1};
       System.out.println(fun(nums));
	}

}
