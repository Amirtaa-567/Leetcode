class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int result = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result = Math.max(result, dfs(matrix, dp, i, j));
            }
        }

        return result;
    }

    public int dfs(int[][] matrix, int[][] dp, int i, int j) {
        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        int max = 1;
        int[][] dir = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        for (int[] d : dir) {
            int ni = i + d[0];
            int nj = j + d[1];

            if (ni >= 0 && ni < matrix.length &&
                nj >= 0 && nj < matrix[0].length &&
                matrix[ni][nj] > matrix[i][j]) {
                max = Math.max(max, 1 + dfs(matrix, dp, ni, nj));
            }
        }

        dp[i][j] = max;
        return max;
    }
}