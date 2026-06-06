class Solution {
    public int bulbSwitch(int n) {
        // boolean [] bulbs=new boolean[n+1];
        // for(int i=1;i<=n;i++){
        //     for(int j=i;j<=n;j+=i){
        //         bulbs[j]=!bulbs[j];
        //     }
        // }
        // int res=0;
        // for(int i=1;i<=n;i++){
        //     if(bulbs[i]) res++;
        // }
        // return res;
        return (int)Math.sqrt(n);
    }
}