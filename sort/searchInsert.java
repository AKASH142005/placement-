class insert_search_element_array {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0,h = n-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return l;
    }
  public static void main(String args[]){
     int nums[]={1,2,4,5,6,7};
    int target=3;
    System.out.print(searchInsert(nums,target));
  }
}
