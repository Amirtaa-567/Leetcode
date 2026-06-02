class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0, c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }else{
                if(l<c){
                    l=c;
                }
                c=0;
            }
            
        }
        if(l<c){
            l=c;
        }
        return l;
    }
}