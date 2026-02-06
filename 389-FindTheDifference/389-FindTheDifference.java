// Last updated: 06/02/2026, 13:54:24
class Solution {
    public char findTheDifference(String s, String t) {
        char ans =0;
        for(char c : s.toCharArray()){
            ans^=c;
        }
        for(char c: t.toCharArray()){
            ans^=c;
        }
      return ans;  
    }
}