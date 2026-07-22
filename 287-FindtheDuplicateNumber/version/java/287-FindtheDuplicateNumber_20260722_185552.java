// Last updated: 22/07/2026, 18:55:52
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        // Create arrays to store the index of characters in both strings
4        int[] indexS = new int[200]; // Stores index of characters in string s
5        int[] indexT = new int[200]; // Stores index of characters in string t
6        
7        // Get the length of both strings
8        int len = s.length();
9        
10        // If the lengths of the two strings are different, they can't be isomorphic
11        if(len != t.length()) {
12            return false;
13        }
14        
15        // Iterate through each character of the strings
16        for(int i = 0; i < len; i++) {
17            // Check if the index of the current character in string s
18            // is different from the index of the corresponding character in string t
19            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
20                return false; // If different, strings are not isomorphic
21            }
22            
23            // Update the indices of characters in both strings
24            indexS[s.charAt(i)] = i + 1; // updating index of current character
25            indexT[t.charAt(i)] = i + 1; // updating index of current character
26        }
27        
28        // If the loop completes without returning false, strings are isomorphic
29        return true;
30    }
31}
32