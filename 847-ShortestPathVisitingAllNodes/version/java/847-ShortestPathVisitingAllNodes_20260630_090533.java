// Last updated: 30/06/2026, 09:05:33
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3
4        int[] ans = new int[nums.length];
5
6        int e = 0;
7        int o = nums.length - 1;
8
9        for(int i = 0; i < nums.length; i++){
10
11            if(nums[i] % 2 == 0){
12                ans[e] = nums[i];
13                e++;
14            }else{
15                ans[o] = nums[i];
16                o--;
17            }
18        }
19
20        return ans;
21    }
22}