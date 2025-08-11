package LongestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 1;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curLong = 1;
                while (set.contains(num + curLong)) {
                    curLong++;
                }
                longest = Math.max(longest, curLong);
            }
        }
        return longest;
    }
}
