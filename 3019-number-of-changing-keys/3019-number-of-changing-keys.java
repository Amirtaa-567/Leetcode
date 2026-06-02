class Solution {
    public int countKeyChanges(String s) {
        String low = s.toLowerCase();
        int a =0;
        for(int i=0;i<low.length()-1;i++){ 
            // char ch = low.charAt(i); 
            // char ch1 = low.charAt(i+1);
            if(low.charAt(i)!=low.charAt(i+1)){
                a++;
            }
        }
        return a;
    }
}