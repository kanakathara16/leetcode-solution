// Last updated: 06/02/2026, 13:54:16
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack();
        int[] res = new int[temperatures.length];
        Arrays.fill(res, 0);

        for (int i = 0; i < temperatures.length; i++) {
            while (!s.empty() && temperatures[i] > temperatures[s.peek()]) {
                int prevIndex = s.pop();
                res[prevIndex] = i - prevIndex;
            }
            s.push(i);
        }
        return res;
    }
}