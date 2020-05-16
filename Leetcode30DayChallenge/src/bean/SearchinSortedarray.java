package bean;

public class SearchinSortedarray {
  private static int fun(int []nums,int start,int end,int key) {
      if(start <= end){
          int mid = start + (end - start) / 2;

          if(nums[mid] == key) return mid;

          else if(nums[start] <= nums[mid]){
              if(nums[start] <= key && nums[mid] >= key){
                  return fun(nums, start, mid - 1, key);
              }else{
                  return fun(nums, mid + 1, end, key);
              }
          }else {
              if(nums[mid+1] <= key && nums[end] >= key){
                  return fun(nums, mid + 1 , end, key);
              }else{
                  return fun(nums, start, mid - 1, key);
              }
          }
      }
      return -1;
  }
	public static void main(String[] args) {
		int []nums= {5,1,3};
System.out.println(fun(nums,0,nums.length-1,3));
	}

}
