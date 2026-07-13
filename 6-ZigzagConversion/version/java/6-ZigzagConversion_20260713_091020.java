// Last updated: 13/07/2026, 09:10:20
1class Solution {
2    public String convert(String s, int numRows) {
3        if (numRows == 1) return s;
4        StringBuilder a = new StringBuilder();
5        for (int i = 0; i < numRows; i++) {
6            for (int j = i; j < s.length(); j += (2 * (numRows - 1))) {
7                a.append(s.charAt(j));
8                if (i > 0 && i < numRows - 1 && j + (2 * (numRows - 1)) - (2 * i) < s.length()) {
9                    a.append(s.charAt(j + (2 * (numRows - 1)) - (2 * i)));
10                }
11            }
12        }
13        return a.toString();
14    }
15}