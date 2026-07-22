// Last updated: 22/07/2026, 19:01:13
1class Solution {
2    public int[] asteroidCollision(int[] nums) {
3        int n=nums.length;
4        Stack<Integer> st = new Stack<Integer>();
5        for(int i=0;i<n;i++){
6           if(nums[i]>0){
7            st.push(nums[i]);
8           }
9           else{
10            while(!st.isEmpty()&&st.peek()>0&&st.peek()<Math.abs(nums[i])){
11                st.pop();
12            }
13            if(st.isEmpty()||st.peek()<0){
14                st.push(nums[i]);
15            }
16            if(st.peek()==Math.abs(nums[i])){
17                st.pop();
18            }
19           }
20            
21        }
22
23         int[] ans = new int[st.size()];
24
25        for(int i=st.size()-1;i>=0;i--) {
26            ans[i] = st.pop();
27        }
28
29        return ans;
30        
31    }
32}