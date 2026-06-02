class Solution {
    public int differenceOfSum(int[] nums) {
        int x =0;
        int y =0;
        int i=0;
        // for(int i=0;i<nums.length; i++){
        while(i<nums.length){
            x +=nums[i];
            int j=nums[i];
            while(j>0){
                y += j % 10;
                j /= 10;
                
            }
            i++;
        }
    return x-y;
    }
}