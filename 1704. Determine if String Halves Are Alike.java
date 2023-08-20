class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        s=s.toLowerCase();
        if(n%2!=0)
        return false;
        int c1=0;
        int c2=0;
        String s1=s.substring(0,n/2);
        String s2=s.substring(n/2,n);

        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            c1++;
        }
       for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            c2++;
        }

        return c1==c2;
    }
}
