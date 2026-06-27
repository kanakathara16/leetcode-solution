// Last updated: 27/06/2026, 09:06:42
1class Solution {
2    static boolean[] cols;
3    static boolean[] left_diag;
4    static boolean[] right_diag;
5    public static List<List<String>> solveNQueens(int n) {
6        cols = new boolean[n];
7        left_diag = new boolean[2*n-1];
8        right_diag = new boolean[2*n-1];
9
10        var board = createBoard(n);
11
12        List<List<String>> ans = new ArrayList<>();
13        helper(board, 0, ans);
14        return ans;
15    }
16
17    private static void helper(char[][] board, int r, List<List<String>> ans){
18        if(r >= board.length){
19            List<String> t = new ArrayList<>();
20            for (char[] chars : board) t.add(new String(chars));
21            ans.add(t);
22            return;
23        }
24
25        for(int c=0; c < board.length; c++){
26            // check if we can place queen at r,c
27            int diag1 = r - c + board.length - 1;
28            int diag2 = r + c;
29
30            if(cols[c] || left_diag[diag1] || right_diag[diag2])
31                continue;
32
33            // place queen at r,c
34            board[r][c] = 'Q';
35            // mark the col and diags as true to indicate a queen has already been placed.
36            cols[c] = true;
37            left_diag[diag1] = true;
38            right_diag[diag2] = true;
39
40            helper(board, r+1, ans);
41
42            // undo changes
43            board[r][c] = '.';
44            cols[c] = false;
45            left_diag[diag1] = false;
46            right_diag[diag2] = false;
47        }
48    }
49    private static char[][] createBoard(int n){
50        char[][] board = new char[n][n];
51        for(int i=0; i < n; i++) {
52            char[] row = new char[n];
53            Arrays.fill(row, '.');
54            board[i] = row;
55        }
56        return board;
57    }
58
59}