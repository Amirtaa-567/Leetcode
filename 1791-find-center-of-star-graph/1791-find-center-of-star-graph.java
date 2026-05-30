class Solution {
    public int findCenter(int[][] edge) {
        return (edge[0][0]==edge[1][0] || edge[0][0]==edge[1][1] ? edge[0][0]:edge[0][1]);
    }
}