// Last updated: 18/06/2026, 07:33:14
1class Solution {
2    public int reverse(int x) {
3        int n =x;
4        long c=0;
5        while(n!=0){
6            int r = n%10;
7            c = (c*10)+r;
8            n/=10;
9        }if(c>Integer.MAX_VALUE || c<Integer.MIN_VALUE){
10            return 0;
11        }
12        
13        
14
15      return (int) c;  
16    }
17}