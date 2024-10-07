class Solution {
    public int minLength(String s) {

        //USING STACK
        // Stack<Character> st=new Stack<>();
        // for(char ch:s.toCharArray()){
        //     if(!st.isEmpty() && (ch=='B' && st.peek()=='A' || ch=='D' && st.peek()=='C')) 
        //     st.pop();

        //     else st.push(ch);
        // }
        // return st.size();

        // USING ARRAY
        int i = 0; 
        char[] arr = s.toCharArray();
        
        for (char ch : arr) {
            if (i > 0 && ((ch == 'B' && arr[i - 1] == 'A') || (ch == 'D' && arr[i - 1] == 'C'))) {
                i--; 
            } else {
                arr[i++] = ch; 
            }
        }
        return i;
    }
}
