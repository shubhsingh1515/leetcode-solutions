class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int c = 0;
        int i = 1;
        while (i <= a.length() || i <= b.length() || c != 0) {
            int sum = c;
            sum += a.length() - i < 0 ? 0 : a.charAt(a.length() - i) - '0';
            sum += b.length() - i < 0 ? 0 : b.charAt(b.length() - i) - '0';
            c = sum >= 2 ? 1 : 0;
            if (sum == 0 || sum == 2)
                ans.append('0');
            else 
                ans.append('1');
            i++;
        }
        return ans.reverse().toString();
    }
}
