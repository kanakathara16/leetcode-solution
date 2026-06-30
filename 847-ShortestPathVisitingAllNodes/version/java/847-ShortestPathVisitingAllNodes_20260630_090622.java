// Last updated: 30/06/2026, 09:06:22
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        if(nums.length==0) return 0;
4        TreeSet <Integer> set=new TreeSet<>();
5        for(int i:nums){
6            set.add(i);
7        }
8        int num[]=new int[set.size()];
9        int n=0;
10        for(int i:set){
11            num[n++]=i;
12        }
13        int sequence=1;
14        int long_sequence=1;
15        for(int i=0;i<num.length-1;i++){
16            if(num[i]==(num[i+1]-1)){
17                sequence++;
18                long_sequence=Math.max(long_sequence,sequence);
19            }
20            else{
21                sequence=1;
22            }
23        }
24        return long_sequence;
25    }
26}