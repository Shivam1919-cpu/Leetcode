class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        // Step 1: Count frequencies of each number 
        // Constraints usually state 0 <= nums[i] <= 100
        int[] count = new int[102];
        for (int num : nums) {
            count[num]++;
        }
        
        // Step 2: Transform counts into prefix sums (running total of smaller numbers)
        int runningSum = 0;
        for (int i = 0; i < count.length; i++) {
            int currentFrequency = count[i];
            count[i] = runningSum;
            runningSum += currentFrequency;
        }
        
        // Step 3: Map the original values to their smaller-element counts
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = count[nums[i]];
        }
        
        return result;
    }
}