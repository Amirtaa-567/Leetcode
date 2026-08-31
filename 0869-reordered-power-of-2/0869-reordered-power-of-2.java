class Solution {
    public boolean reorderedPowerOf2(int n) {
        char[] a = String.valueOf(n).toCharArray();
        Arrays.sort(a);

        for (int i = 0; i < 31; i++) {
            int x = 1 << i;
            char[] b = String.valueOf(x).toCharArray();
            Arrays.sort(b);

            if (Arrays.equals(a, b)) {
                return true;
            }
        }

        return false;
    }
}