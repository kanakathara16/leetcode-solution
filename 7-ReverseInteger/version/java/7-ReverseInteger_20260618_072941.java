// Last updated: 18/06/2026, 07:29:41
1class Solution {
2    public int reverse(int x) {
3        int copy = x;
4        long count = 0; // use long to handle overflow during calculation
5
6        while (copy != 0) {
7            int rem = copy % 10;          // get last digit
8            count = (count * 10) + rem; // build reversed number
9            copy = copy / 10;             // remove last digit
10        }
11
12        // check for overflow
13        if (count > Integer.MAX_VALUE || count < Integer.MIN_VALUE) {
14            return 0;
15        }
16
17        return (int) count;
18    }
19}