class Solution {
    public String longestDiverseString(int a, int b, int c) {
        
        int counta=0;
        int countb = 0 ; 
        int countc =0;
        int maxlen=a+b+c;
        
        StringBuilder str = new StringBuilder(); 
        for(int i =0 ;i<maxlen;i++){
            if(counta!=2 && a>=b && a>=c || a>0 && (countb ==2 ||countc==2)){
                str.append('a');
                counta++;
                countb = 0 ; 
                countc = 0 ;
                a--;
            }
            else  if(countb!=2 && b>=a && b>=c || b>0 && (counta ==2 ||countc==2)){
                str.append('b');
                countb++;
                counta = 0 ; 
                countc = 0 ;
                b--;
            }
               else  if(countc!=2 && c>=a && c>=b || c>0 && (counta ==2 ||countb==2)){
                str.append('c');
                countc++;
                counta = 0 ; 
                countb = 0 ;
                c--;
            }
         } 
return str.toString();
    }
}
