// Last updated: 27/06/2026, 09:16:02
1class Solution {
2    public boolean isNumber(String s) {
3        boolean seenDigit = false;
4        boolean seenDot = false;
5        boolean seenE = false;
6        for (int i = 0; i < s.length(); i++) {
7            char ch = s.charAt(i);
8            if (Character.isDigit(ch)) {
9                seenDigit = true;
10            }
11            else if (ch == '.') {
12                if (seenDot || seenE) {
13                    return false;
14                }
15                seenDot = true;
16            }
17             else if (ch == 'e' || ch == 'E') {
18                if (seenE || !seenDigit) {
19                    return false;
20                }
21                seenE = true;
22                seenDigit = false;
23            }
24            else if (ch == '+' || ch == '-') {
25                if (i != 0 &&
26                    s.charAt(i - 1) != 'e' &&
27                    s.charAt(i - 1) != 'E') {
28                    return false;
29                }
30            }
31            else {
32                return false;
33            }
34        }
35
36        return seenDigit;
37    }
38}