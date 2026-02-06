// Last updated: 06/02/2026, 13:54:13
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        long res = 0;
        Map<Double,Integer> hm = new HashMap();
        for(int[] r : rectangles){
            double ratio = (double)r[0] / r[1];
            res = res + hm.getOrDefault(ratio,0);
            hm.put(ratio,hm.getOrDefault(ratio,0)+1);
        }
     return res;   
    }
}