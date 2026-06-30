// Last updated: 30/06/2026, 09:01:43
1import java.util.*;
2
3public class Solution {
4    public int shortestPathLength(int[][] graph) {
5        int V = graph.length;
6        Queue<int[]> currLevel = new LinkedList<>();
7        for (int u = 0; u < V; u++) {
8            currLevel.offer(new int[]{u, 1 << u});
9        }
10        
11        int allVisited = (1 << V) - 1;
12        boolean[][] visited = new boolean[V][allVisited + 1];
13        for (int u = 0; u < V; u++) {
14            visited[u][1 << u] = true;
15        }
16        
17        int pathLength = 0;
18        
19        while (!currLevel.isEmpty()) {
20            int n = currLevel.size();
21            while (n > 0) {
22                int[] node = currLevel.poll();
23                int u = node[0];
24                int bitMask = node[1];
25                
26                if (bitMask == allVisited) {
27                    return pathLength;
28                }
29                
30                for (int v : graph[u]) {
31                    int nextBitMask = bitMask | (1 << v);
32                    
33                    if (visited[v][nextBitMask]) {
34                        continue;
35                    }
36                    
37                    if (nextBitMask == allVisited) {
38                        return pathLength + 1;
39                    }
40                    
41                    currLevel.offer(new int[]{v, nextBitMask});
42                    visited[v][nextBitMask] = true;
43                }
44                
45                n--;
46            }
47            
48            pathLength++;
49        }
50        
51        return -1;
52    }
53}