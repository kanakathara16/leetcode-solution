// Last updated: 22/07/2026, 18:56:58
1class Solution {
2      public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
3		int count = 0;
4		Map<Integer,Integer> hashMap = new HashMap<>();
5		for (int numA : A) {
6			for (int numB : B) {
7				int sumAB = numA + numB;
8				hashMap.put(sumAB, hashMap.getOrDefault(sumAB, 0) + 1);
9			}
10		}
11		for (int numC : C){
12			for (int numD : D){
13				int sumCD = numC + numD;
14				count += hashMap.getOrDefault(-sumCD,0);
15			}
16		}
17		return count;
18}
19}