import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);

            if (map.containsKey(current)) {
                start = Math.max(start, map.get(current) + 1);
            }

            map.put(current, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}