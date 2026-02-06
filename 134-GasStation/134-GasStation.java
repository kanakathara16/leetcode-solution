// Last updated: 06/02/2026, 13:54:35
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalcost = 0;
        int remgas =0;
        int ans=0;
        for(int i =0;i<gas.length;i++){
            totalcost +=gas[i] - cost[i];
            remgas +=gas[i] - cost[i];
            if(remgas <0){
                remgas = 0;
                ans=i+1;
            }
        }
       return totalcost >=0?ans:-1; 
    }
}