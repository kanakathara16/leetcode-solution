// Last updated: 22/07/2026, 18:54:56
1class Solution {
2   public String multiply(String num1, String num2) {
3    int m = num1.length(), n = num2.length();
4    int[] pos = new int[m + n];
5   
6    for(int i = m - 1; i >= 0; i--) {
7        for(int j = n - 1; j >= 0; j--) {
8            int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
9            int p1 = i + j, p2 = i + j + 1;
10            int sum = mul + pos[p2];
11
12            pos[p1] += sum / 10;
13            pos[p2] = (sum) % 10;
14        }
15    }  
16    
17    StringBuilder sb = new StringBuilder();
18    for(int p : pos) if(!(sb.length() == 0 && p == 0)) sb.append(p);
19    return sb.length() == 0 ? "0" : sb.toString();
20}
21}