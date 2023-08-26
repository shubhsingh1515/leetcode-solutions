class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        int n=tokens.length;
        for (int i=0;i<n;i++){
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int o1=st.pop();
                int o2=st.pop();
                if (tokens[i].equals("+"))
                    st.push(o1+o2);
                if (tokens[i].equals("-"))
                    st.push(o2-o1);
                if (tokens[i].equals("*"))
                    st.push(o1*o2);
                if (tokens[i].equals("/"))
                    st.push(o2/o1);
            }else
            st.push(Integer.valueOf(tokens[i]));
        }
        return st.peek();
    }
}
