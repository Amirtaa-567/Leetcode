class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<students.length;i++){
            q.add(students[i]);
        }
        for(int i=sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        int rej=0;
        while(!st.isEmpty() && !q.isEmpty()){
            if(st.peek().equals(q.peek())){
                st.pop();
                q.remove();
                rej=0;
            }
            else{
                q.add(q.remove());
                rej+=1;
                if(rej==q.size()){
                    return q.size();
                }
            }
        }
        return q.size();
    }
}