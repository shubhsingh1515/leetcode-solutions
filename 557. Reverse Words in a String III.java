class Solution {
  public String reverseWords(String s) {
    String words[]=s.split(" ");
    StringBuilder sb=new StringBuilder();

    for(String word : words){
      StringBuilder rev=new StringBuilder(word);
      rev=rev.reverse();
      sb.append(rev);
      sb.append(" ");
    }
    return sb.toString().trim();
    }
}
