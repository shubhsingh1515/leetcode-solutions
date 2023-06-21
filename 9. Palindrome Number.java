class Solution {
    public boolean isPalindrome(int x) {
        int dig,rev=0,n;
        n=x;
       if(x<0){
       return false;
       }
       else{
           
           while(x!=0){
            dig=x%10;
            rev=rev*10+dig;
            x=x/10;   
           }
           if(rev==n)
           return true;
           else
            return false;
       }
    }
}
