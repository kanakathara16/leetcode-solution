// Last updated: 13/07/2026, 09:02:36
1class Solution {
2    public String longestPalindrome(String s) {
3        int n = s.length();
4        String res = "";
5
6        for(int i = 0;i<n;i++){
7            // Odd length palindrome
8            int st = i,end = i;
9            while(st>=0&&end<n&&s.charAt(st)==s.charAt(end)){
10                st--;
11                end++;
12            }
13            String temp = s.substring(st+1,end);
14            if(temp.length()>res.length())res=temp;
15
16            // Even length palindrome
17            st = i;
18            end = i+1;
19            while(st>=0&&end<n&&s.charAt(st)==s.charAt(end)){
20                st--;
21                end++;
22            }
23            temp = s.substring(st+1,end);
24            if(temp.length()>res.length())res=temp;
25        }
26
27        return res;
28    }
29}