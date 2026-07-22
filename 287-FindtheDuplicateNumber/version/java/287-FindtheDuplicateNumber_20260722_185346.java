// Last updated: 22/07/2026, 18:53:46
1class Solution {
2        // 2 Loops
3       public static int findDuplicate(int[] nums) {
4        int len = nums.length;
5        int[] cnt = new int[len + 1];
6        for (int i = 0; i < len; i++) {
7            cnt[nums[i]]++;
8            if (cnt[nums[i]] > 1) {
9                return nums[i];
10            }
11        }
12
13        return len;
14    }
15}