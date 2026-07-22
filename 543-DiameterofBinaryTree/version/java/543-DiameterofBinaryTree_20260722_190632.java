// Last updated: 22/07/2026, 19:06:32
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
17    private int max=0;
18    public int diameterOfBinaryTree(TreeNode root) {
19        computeDiameter(root);
20        return max;
21    }
22
23    private int computeDiameter(TreeNode node){
24        if(node==null) return 0;
25
26        int left = computeDiameter(node.left);
27        int right = computeDiameter(node.right);
28
29        max = Math.max(max,left+right);
30
31        return 1 + Math.max(left, right);
32    }
33}