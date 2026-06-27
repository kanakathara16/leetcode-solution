// Last updated: 27/06/2026, 09:08:03
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int m = s.length(), n = p.length();
4        boolean[][] dp = new boolean[m + 1][n + 1];
5        dp[0][0] = true;
6        for (int j = 2; j <= n; j++) {
7            if (p.charAt(j - 1) == '*') {
8                dp[0][j] = dp[0][j - 2];
9            }
10        }
11        for (int i = 1; i <= m; i++) {
12            for (int j = 1; j <= n; j++) {
13                if (p.charAt(j - 1) == '*') {
14                    dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.'));
15                } else {
16                    dp[i][j] = dp[i - 1][j - 1] && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.');
17                }
18            }
19        }
20        return dp[m][n];
21    }
22}