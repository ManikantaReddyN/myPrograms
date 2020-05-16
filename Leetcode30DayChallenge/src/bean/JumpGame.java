package bean;

public class JumpGame {
private static boolean fun(int []nums) {
	boolean b=false;
	int n=nums.length;
	if(n<=1)
		return true;
	int k=1;
	for(int i=n-2;i>=0;i--) {
		if(i!=0) {
			if(nums[i]>=k)
				k=1;
			else
				k++;
		}else {
			if(nums[i]>=k)
				b=true;
			else
				b=false;
		}
	}
	return b;
}
	public static void main(String[] args) {
		int []nums= {1,2,0,1};
        System.out.println(fun(nums));
	}

}
