// Last updated: 06/02/2026, 13:54:05
class Solution {
    public int kItemsWithMaximumSum(int num1, int num0, int numn, int k) {
        int sum =0;
        if(k<=num1)
        return k;
        else{
            sum+=num1;
            k-=num1;
        }
        if(k<=num0)
        return sum;
        else{
            k-=num0;
        }
        sum-=k;
        return sum;
        
    }
}