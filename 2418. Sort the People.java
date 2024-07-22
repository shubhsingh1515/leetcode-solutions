class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map=new TreeMap<>(Collections.reverseOrder());
        String newNames[]=new String[names.length];
        for(int i=0;i<names.length;i++)
        {
          map.put(heights[i],names[i]); 
        }
        int index=0;
       for(String name:map.values()){
         newNames[index++]=name;
       }
        return newNames;
    }
}
