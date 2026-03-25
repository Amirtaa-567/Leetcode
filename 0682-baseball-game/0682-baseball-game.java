class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        int top=-1;
        for(String op:operations){
            if(op.equals("+")){
                int x=st.pop();
                int y=st.peek();
                st.push(x);
                st.push(x+y);
            }
            else if(op.equals("D")){
                st.push(2*st.peek());
            }
            else if(op.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int s:st){
            sum+=s;
        }
        return sum;
    }
}