// Last updated: 22/07/2026, 19:00:33
1class Solution {
2    public boolean find132pattern (int[] nums) {
3        Stack <Integer> stack = new Stack ();
4        int second = Integer.MIN_VALUE;
5        for (int i = nums.length - 1; i >= 0; i--) {
6            if (nums [i] < second)
7                return true;
8            while (!stack.isEmpty() && nums [i] > stack.peek ())
9                second = stack.pop ();
10            stack.push (nums [i]);
11        }
12        return false;
13    }
14}