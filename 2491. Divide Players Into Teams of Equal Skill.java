class Solution {
    public long dividePlayers(int[] skill) {
      int n=skill.length;
      if(n==2)
      return skill[0]*skill[1];

       long ans=0;
       Arrays.sort(skill);

       int i=0, j=n-1;
       int sum = skill[i]+skill[j];
       while(i<j){
        if(skill[i] + skill[j] != sum ) {
            return -1;
        }
        ans+=skill[i]*skill[j];
        i++;
        j--;
       }
       return ans;
    }
}
