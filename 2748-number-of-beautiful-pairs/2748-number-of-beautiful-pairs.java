class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int fd=first(nums[i]);
                int ld=last(nums[j]);
                if(gcd(fd,ld)==1){
                    count++;
                }
            }
        }
        return count;
    }
    public static int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int first(int n){
        while(n>=10){
            n/=10;
        }
        return n;
    }
    public static int last(int n){
        return n%10;
    }


}