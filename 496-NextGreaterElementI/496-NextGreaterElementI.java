// Last updated: 06/02/2026, 13:54:22
import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        int[] res = new int[nums1.length];
        Arrays.fill(res, -1);

        // Build hashmap of next greater elements for nums2
        for (int x : nums2) {
            while (!s.empty() && x > s.peek()) {
                hm.put(s.pop(), x);
            }
            s.push(x);
        }

        // Fill result for nums1 using hashmap
        for (int i = 0; i < nums1.length; i++) {
            if (hm.containsKey(nums1[i])) {
                res[i] = hm.get(nums1[i]);
            }
        }

        return res;
    }
}