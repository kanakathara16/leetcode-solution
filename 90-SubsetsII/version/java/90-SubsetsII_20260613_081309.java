// Last updated: 13/06/2026, 08:13:09
1public class Solution {
2    public void nextPermutation(int[] nums) {
3        int i = nums.length - 2;
4        while (i >= 0 && nums[i + 1] <= nums[i]) {
5            i--;
6        }
7        if (i >= 0) {
8            int j = nums.length - 1;
9            while (nums[j] <= nums[i]) {
10                j--;
11            }
12            swap(nums, i, j);
13        }
14        reverse(nums, i + 1);
15    }
16
17    private void reverse(int[] nums, int start) {
18        int i = start, j = nums.length - 1;
19        while (i < j) {
20            swap(nums, i, j);
21          i++;
22          j--;
23        }
24    }
25
26    private void swap(int[] nums, int i, int j) {
27        int temp = nums[i];
28        nums[i] = nums[j];
29        nums[j] = temp;
30    }
31}