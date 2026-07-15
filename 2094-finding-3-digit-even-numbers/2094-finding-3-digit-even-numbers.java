class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> list = new ArrayList<>();
        
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }
        
        for (int i = 100; i <= 998; i += 2) {
            int number = i;
            int[] freq2 = new int[10];
            
            int temp = number;
            while (temp > 0) {
                freq2[temp % 10]++;
                temp /= 10;
            }
            
            boolean add = true;
            for (int j = 0; j < 10; j++) {
                if (freq2[j] > freq[j]) {
                    add = false;
                    break;
                }
            }
            
            if (add) {
                list.add(number);
            }
        }
        
        int k = list.size();
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}