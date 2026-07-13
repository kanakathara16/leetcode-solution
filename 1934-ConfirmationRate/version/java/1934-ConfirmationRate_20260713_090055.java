// Last updated: 13/07/2026, 09:00:55
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int[] sol = new int[nums.length];
4        sol[0] = 1;
5        int prod = 1;
6        for(int i =1; i < nums.length; i++){
7            prod = prod * nums[i-1];
8            sol[i] = prod; 
9        }
10        prod = 1;
11        for(int i = nums.length-2; i >=0; i--){
12            prod = prod * nums[i+1];
13            sol[i] = sol[i] * prod;
14        }
15        return sol;
16    }
17}