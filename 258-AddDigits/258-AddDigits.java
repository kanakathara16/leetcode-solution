// Last updated: 06/02/2026, 13:54:28
class Solution {
    public int addDigits(int num) {
    if(num ==0){
        return 0;
    }return (num%9==0)?9:num%9;
    }
}