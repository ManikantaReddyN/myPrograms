package bean;

public class ProductofArrayExceptSelf {

	 private static int [] fun(int []nums) {
		 int n=nums.length;
		int left[]=new int[n];
		int right[]=new int[n];
		int prod[]=new int[n];
		left[0] = 1; 
	
        right[n - 1] = 1; 

        for (int i = 1; i < n; i++) 
            left[i] = nums[i - 1] * left[i - 1]; 

        for (int j = n - 2; j >= 0; j--) 
            right[j] = nums[j + 1] * right[j + 1]; 
  
        for (int i = 0; i < n; i++) 
            prod[i] = left[i] * right[i]; 
		 return prod;
	 }
	 public static void main(String[] args) {
		int []nums= {0,0};
		fun(nums);
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");

	}

}
