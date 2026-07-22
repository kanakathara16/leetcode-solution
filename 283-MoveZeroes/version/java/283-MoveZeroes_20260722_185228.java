// Last updated: 22/07/2026, 18:52:28
1class Solution {
2     public void moveZeroes(int[] nums) {
3        int snowBallSize = 0; 
4        for (int i=0;i<nums.length;i++){
5	        if (nums[i]==0){
6                snowBallSize++; 
7            }
8            else if (snowBallSize > 0) {
9	            int t = nums[i];
10	            nums[i]=0;
11	            nums[i-snowBallSize]=t;
12            }
13        }
14    }
15}