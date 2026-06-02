class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(int i=0;i<sentences.length;i++){
            int co=1;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j) ==' '){
                    co++;
                }
            }
            if(count<co){
                count=co;
            }
        }
        return count;
    }
}