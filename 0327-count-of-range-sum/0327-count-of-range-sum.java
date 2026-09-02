class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        long[] prefix = new long[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        return mergeSort(prefix, 0, prefix.length - 1, lower, upper);
    }

    public int mergeSort(long[] arr, int left, int right, int lower, int upper) {
        if (left >= right) {
            return 0;
        }

        int mid = left + (right - left) / 2;

        int count = mergeSort(arr, left, mid, lower, upper);
        count += mergeSort(arr, mid + 1, right, lower, upper);

        int low = mid + 1;
        int high = mid + 1;

        for (int i = left; i <= mid; i++) {
            while (low <= right && arr[low] - arr[i] < lower) {
                low++;
            }

            while (high <= right && arr[high] - arr[i] <= upper) {
                high++;
            }

            count += high - low;
        }

        long[] temp = new long[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = 0; i < temp.length; i++) {
            arr[left + i] = temp[i];
        }

        return count;
    }
}