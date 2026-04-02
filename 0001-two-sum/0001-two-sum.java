class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n = nums.length;
        for(int i=1;i<n;i++){
            for(int j = i; j<n; j++){
                int x = j-i;
                if(nums[x]+nums[j]==target){
                    return new int[]{x,j};
                }
            }
        }
        return new int[0];
    }
}