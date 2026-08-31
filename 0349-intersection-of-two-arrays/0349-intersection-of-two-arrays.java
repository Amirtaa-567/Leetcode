class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int n : nums1) {
            set.add(n);
        }

        for (int n : nums2) {
            if (set.contains(n)) {
                result.add(n);
            }
        }

        int[] ans = new int[result.size()];
        int i = 0;

        for (int n : result) {
            ans[i++] = n;
        }

        return ans;
    }
}