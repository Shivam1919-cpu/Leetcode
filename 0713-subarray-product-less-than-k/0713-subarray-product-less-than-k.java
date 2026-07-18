class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int totalcount = 0;
        int multiplyAns = 1 ;
        int left = 0;
        if (k <= 1){
            return 0;
        } 
        for(int right = 0; right < n; right++){
            multiplyAns *= nums[right];
            while(multiplyAns >= k){
                multiplyAns /= nums[left];
                left++;
            }
            totalcount += (right - left + 1);
        }
        return totalcount;
    }
    
}