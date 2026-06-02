class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> ans=new HashMap<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            ans.put(ch,ans.getOrDefault(ch,0)+1);
            while(ans.get(ch)>1){
                char leftChar=s.charAt(left);
                ans.put(leftChar,ans.get(leftChar)-1);
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}