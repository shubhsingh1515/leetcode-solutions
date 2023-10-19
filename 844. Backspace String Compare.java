class Solution {
    public static boolean backspaceCompare(String s, String t) {
        return helper(s).equals(helper(t));
    }

    public static String helper(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='#'){
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
