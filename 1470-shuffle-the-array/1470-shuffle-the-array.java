class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x[]=new int[nums.length];
        int a=0;
        for(int i=0;i<n;i++){
            x[a++]=nums[i];
            x[a++]=nums[i+n];
        }
        return x;
    }
}