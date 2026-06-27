// Last updated: 27/06/2026, 09:12:53
1public class Solution {
2    public int longestValidParentheses(String s) {
3        LinkedList<Integer> stack = new LinkedList<>();
4        int result = 0;
5        stack.push(-1);
6        for (int i = 0; i < s.length(); i++) {
7            if (s.charAt(i) == ')' && stack.size() > 1 && s.charAt(stack.peek()) == '(') {
8                stack.pop();
9                result = Math.max(result, i - stack.peek());
10            } else {
11                stack.push(i);
12            }
13        }
14        return result;
15    }
16}