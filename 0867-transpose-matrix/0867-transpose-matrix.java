class Solution {
    public int[][] transpose(int[][] a) {
        int r[][]=new int[a[0].length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                r[j][i]=a[i][j];
            }
        }
      return r;
    }
}