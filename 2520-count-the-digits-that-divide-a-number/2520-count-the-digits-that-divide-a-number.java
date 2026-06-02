class Solution {
    public int countDigits(int num) {
        int val = num;
        int count = 0;
        int x=0;
        while(val>0){
            x=val%10;
            if(num % x==0){
                count++;
            }
            val/=10;
        }
        return count;
    }
}