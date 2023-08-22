class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s=new StringBuilder();
        while(columnNumber>0)
        {
            int rem=((columnNumber-1)%26);
            s.append((char)(65+rem));
            columnNumber=(columnNumber-1)/26;
        }
        s.reverse();
        return s.toString();
    }
}
