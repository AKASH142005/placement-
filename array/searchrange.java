import java.util.*;
class searchRange {
    public static int[] search(int[] nums, int target) {
        int first = -1, last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first, last};
    }
    public static void main(String args[]){
        int nums[]={1,2,4,5,6,7};
       int target=4;
       System.out.print(Arrays.toString(search(nums,target)));
}
}
