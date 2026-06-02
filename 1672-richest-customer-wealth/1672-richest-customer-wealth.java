class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=0;
        for(int i=0;i<accounts.length;i++){
            int w=0;
            for(int j=0;j<accounts[i].length;j++){
                w += accounts[i][j];
            }
            if(wealth<w){
                wealth=w;
            }
        }
        return wealth;
    }
}