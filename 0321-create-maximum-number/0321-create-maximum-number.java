class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] result = new int[k];

        int start = Math.max(0, k - nums2.length);
        int end = Math.min(k, nums1.length);

        for (int i = start; i <= end; i++) {
            int[] a = getMax(nums1, i);
            int[] b = getMax(nums2, k - i);
            int[] merged = merge(a, b);

            if (greater(merged, 0, result, 0)) {
                result = merged;
            }
        }

        return result;
    }

    public int[] getMax(int[] nums, int k) {
        int[] result = new int[k];
        int start = 0;

        for (int i = 0; i < k; i++) {
            int max = -1;

            for (int j = start; j <= nums.length - (k - i); j++) {
                if (nums[j] > max) {
                    max = nums[j];
                    start = j + 1;
                }
            }

            result[i] = max;
        }

        return result;
    }

    public int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length || j < b.length) {
            if (greater(a, i, b, j)) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        return result;
    }

    public boolean greater(int[] a, int i, int[] b, int j) {
        while (i < a.length && j < b.length && a[i] == b[j]) {
            i++;
            j++;
        }

        if (j == b.length) {
            return true;
        }

        if (i == a.length) {
            return false;
        }

        return a[i] > b[j];
    }
}