class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int c=0, ce=0;
        for(int i=0;i<n;i++){
            if(c==0){
                ce=nums[i];
            }
            if(nums[i]==ce){
                c++;
            }else{
                c--;
            }
        }
        c=0;
        for(int num:nums){
            if(num==ce){
                c++;
            }
        }
        if(c>n/2){
            return ce;
        }else{
            return -1;
        }
    }
}