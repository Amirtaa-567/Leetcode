class Solution {
    public int climbStairs(int n) {
        if (n <= 1) return 1;
        int x = 1, y = 1;
        for (int i = 2; i <= n; i++) {
            int z = x + y;
            x = y;
            y = z;
        }
        return y;
    }
}