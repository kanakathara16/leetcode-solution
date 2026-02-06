// Last updated: 06/02/2026, 13:54:37
class Solution {
    public void sortColors(int[] nums) {
        int zi=0;int ti=nums.length-1;int i=0;
        while(i<=ti){
            if(nums[i]==0){
                int t = nums[i];
                nums[i++] = nums[zi];
                nums[zi++]=t;
            }else if(nums[i]==1) ++i;
            else{
                int t = nums[i];
                nums[i] = nums[ti];
                nums[ti--]=t;
            }
        }
        
    }
}