// Last updated: 30/06/2026, 09:02:51
1class Solution {
2    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
3        double[] maxProb = new double[n];
4        maxProb[start_node] = 1.0;
5
6        for (int i = 0; i < n - 1; i++) {
7            boolean updated = false;
8            for (int j = 0; j < edges.length; j++) {
9                int u = edges[j][0];
10                int v = edges[j][1];
11                double prob = succProb[j];
12
13                if (maxProb[u] * prob > maxProb[v]) {
14                    maxProb[v] = maxProb[u] * prob;
15                    updated = true;
16                }
17                if (maxProb[v] * prob > maxProb[u]) {
18                    maxProb[u] = maxProb[v] * prob;
19                    updated = true;
20                }
21            }
22            if (!updated) break;
23        }
24
25        return maxProb[end_node];
26    }
27}