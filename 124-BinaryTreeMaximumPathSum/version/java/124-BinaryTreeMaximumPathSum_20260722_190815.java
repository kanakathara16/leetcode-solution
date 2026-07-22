// Last updated: 22/07/2026, 19:08:15
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int ans = Integer.MIN_VALUE;
18    
19    public int maxPathSum(TreeNode root) {
20        helper(root);
21        return ans;
22    }
23
24    int helper(TreeNode node) {
25        if (node == null) return 0;
26
27        // Get left and right max path sum; ignore negative paths
28        int left = Math.max(helper(node.left), 0);
29        int right = Math.max(helper(node.right), 0);
30
31        // Compute the path sum passing through current node
32        int pathSum = node.val + left + right;
33        
34        // Update global max
35        ans = Math.max(ans, pathSum);
36
37        // Return max gain including current node to parent
38        return node.val + Math.max(left, right);
39    }
40}