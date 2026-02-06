// Last updated: 06/02/2026, 13:54:32
class Solution {
    public int titleToNumber(String ct) {
        int res = 0;
        int ans=0;
        for(int i=0;i<ct.length();i++){
         ans = ct.charAt(i)-'A' +1;
        res = res*26+ans;
        
        }
        return res;
    }
}