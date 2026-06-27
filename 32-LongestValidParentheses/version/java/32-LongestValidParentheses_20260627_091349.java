// Last updated: 27/06/2026, 09:13:49
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        Arrays.sort(nums);
4        int target=1;
5        for(int i:nums){
6            if(i==target) target++;
7            else if(i>target) return target;
8        }
9        return target;
10    }
11}