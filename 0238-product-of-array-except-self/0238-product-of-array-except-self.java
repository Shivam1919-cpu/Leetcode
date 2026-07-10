class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int prodoflef = 1;
        int prodofright = 1 ;

        for(int i = n-1; i>=0 ; i--){
            ans[i] = prodofright;
            prodofright = prodofright * nums[i];
        }
        for(int i = 0 ;i<n; i++){
            ans[i] = ans[i]*prodoflef;
            prodoflef = prodoflef * nums[i];
        }

        return ans;
    }
}