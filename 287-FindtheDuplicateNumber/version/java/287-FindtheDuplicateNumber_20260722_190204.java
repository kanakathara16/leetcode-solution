// Last updated: 22/07/2026, 19:02:04
1public class Solution {
2    public int splitArray(int[] nums, int k) {
3        int low = 0, high = 0;
4        for (int num : nums) {
5            low = Math.max(low, num);
6            high += num;
7        }
8        int ans = high;
9        while (low <= high) {
10            int mid = low + (high - low) / 2;
11            if (isFeasible(nums, mid, k)) {
12                ans = mid;
13                high = mid - 1;
14            } else {
15                low = mid + 1;
16            }
17        }
18        return ans;
19    }
20    
21    private boolean isFeasible(int[] nums, int maxSum, int k) {
22        int count = 1;
23        int currentSum = 0;
24        for (int num : nums) {
25            currentSum += num;
26            if (currentSum > maxSum) {
27                count++;
28                currentSum = num;
29                if (count > k) return false;
30            }
31        }
32        return true;
33    }
34}