class Solution {
    public boolean isPalindrome(String s) {
        String os ="";
        for(int i=0; i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                os+= Character.toLowerCase(c);
            }
        }
        
        String rev ="";
        for(int i=os.length()-1;i>=0;i--){
            rev += os.charAt(i);
        }
        return os.equals(rev);
    }
}