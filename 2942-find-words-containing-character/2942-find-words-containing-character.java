class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(words[i].indexOf(x) != -1){
                    arr.add(i);
                    break;
                }
            }
        }
        return arr;
    }
}