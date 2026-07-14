class Solution {
    public int findNumbers(int[] nums) {

        int evenCount = 0;

        for (int n : nums) {

            int digits = 0;
            int temp = n;

            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

            if (digits % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }
}