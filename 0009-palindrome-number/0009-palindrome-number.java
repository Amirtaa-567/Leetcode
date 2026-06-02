class Solution {
    public boolean isPalindrome(int x) {
        int a = 0;
        int b = x;
        while(b>0){
            int c = 0;
            c += b % 10;
            a = a * 10 + c;
            b = b / 10;
        }
        return x==a;
    }
}