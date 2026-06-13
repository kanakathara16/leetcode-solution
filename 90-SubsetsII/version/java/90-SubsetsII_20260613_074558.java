// Last updated: 13/06/2026, 07:45:58
1class Solution {
2
3    public List<List<Integer>> subsetsWithDup(int[] nums) {
4        Arrays.sort(nums);
5
6        List<List<Integer>> result = new ArrayList<>();
7        method(0, nums, new ArrayList<>(), result);
8
9        return result;
10    }
11
12    private void method(int start, int[] nums,List<Integer> curr,List<List<Integer>> result) {
13        result.add(new ArrayList<>(curr));
14        for (int i = start; i < nums.length; i++) {
15            if (i > start && nums[i] == nums[i - 1]) {
16                continue;
17            }
18            curr.add(nums[i]);
19            method(i + 1, nums, curr, result);
20            curr.remove(curr.size() - 1);
21        }
22    }
23}