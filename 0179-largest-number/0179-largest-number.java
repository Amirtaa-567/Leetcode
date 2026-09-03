class Solution {
    public String largestNumber(int[] nums) {

        int n = nums.length;

        for (int k = 0; k < n; k++) {

            for (int i = 0; i < n - 1; i++) {

                String a = "" + nums[i] + nums[i + 1];
                String b = "" + nums[i + 1] + nums[i];

                if (b.compareTo(a) > 0) {
                    int t = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = t;
                }
            }
        }

        if (nums[0] == 0) {
            return "0";
        }

        String max = "";

        for (int i : nums) {
            max += i;
        }

        return max;
    }
}