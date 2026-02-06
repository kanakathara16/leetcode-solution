// Last updated: 06/02/2026, 13:54:34
class Solution {
    public String convertToTitle(int cn) {
        
        StringBuilder sb = new StringBuilder();

        while(cn>0){
            cn--;
            int rem = cn%26;
            char c = (char)('A'+rem);
            sb.append(c);
            cn/=26;

        }
        return sb.reverse().toString();
    }
}