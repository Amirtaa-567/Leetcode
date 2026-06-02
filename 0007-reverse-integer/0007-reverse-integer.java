class Solution {
    public int reverse(int x) {
        boolean neg = x < 0;
        String s = String.valueOf(Math.abs((long)x));
        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s2 += s.charAt(i);
        }
        long n = Long.parseLong(s2);
        if (neg) {
            n = -n;
        }
        if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)n;
    }
}