// Last updated: 13/07/2026, 09:11:54
1class Solution {
2    public int myAtoi(String s) {
3        s = s.trim(); // Remove leading whitespace
4        int sign = 1, i = 0;
5        long res = 0; // Using long to handle overflow cases
6
7        if (s.length() == 0) return 0;
8
9        // Check for sign
10        if (s.charAt(0) == '-') { sign = -1; i++; }
11        else if (s.charAt(0) == '+') { i++; }
12
13        // Process numerical characters
14        while (i < s.length()) {
15            char ch = s.charAt(i);
16            if (ch < '0' || ch > '9') break; // Stop at non-numeric character
17
18            res = res * 10 + (ch - '0'); // Convert char to number
19            if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE; // Handle overflow
20            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
21
22            i++;
23        }
24        return (int) (sign * res);
25    }
26}