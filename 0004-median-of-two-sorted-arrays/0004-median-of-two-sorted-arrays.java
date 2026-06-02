class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length+nums2.length];
        int n =merge.length;
        int index =0;
        for(int i=0;i<nums1.length;i++){
            merge[index++]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            merge[index++]=nums2[j];
        }
        Arrays.sort(merge);
            if(n%2==0){
                return (double)(merge[n/2 -1]+merge[n/2])/2.0;
            }else{
                return (double)(merge[n/2]);
            }
    }
}