class Solution {
    public boolean checkIfPangram(String sentence) {
        int count =0;
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<alpha.length();i++){
            char ch =alpha.charAt(i);
            for(int j=0;j<sentence.length();j++){
                if(sentence.charAt(j) == ch){
                    count++;
                    break;
                }
            }
        }
       return count==26;
    }
}