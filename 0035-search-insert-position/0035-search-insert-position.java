class Solution {
    public int searchInsert(int[] nums, int target) {
        int count = nums.length-2;
        for(int i=0 ; i<= nums.length-1 ; i++){
            if(nums[i] == target )
            {
                return i;
            }
            if(nums[i] != target && target < nums[i]  ){
                return i;
            }
        }
        return nums.length;
    }
}