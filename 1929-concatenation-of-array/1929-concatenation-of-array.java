class Solution {
    public int[] getConcatenation(int[] nums) {
        int a[]=new int[nums.length*2];
        int x=0;
        for(int i=0;i<nums.length;i++){
            a[x++]=nums[i];
            // a[i]=nums[x++];
            // if(x==nums.length){
            //     x=0;
            // }
        }
        for(int i=0;i<nums.length;i++){
            a[x++]=nums[i];
        }
        return a;
    }
}