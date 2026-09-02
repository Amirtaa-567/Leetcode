class Solution {
    public boolean uniformArray(int[] nums) {
        boolean hasOdd = false;
        boolean hasEven = false;

        for (int num : nums) {
            if (num % 2 == 0) {
                hasEven = true;
            } else {
                hasOdd = true;
            }
        }
        return true;
    }
}