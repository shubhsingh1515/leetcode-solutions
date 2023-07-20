class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<>();
        int s1=nums1.length;
        int s2=nums2.length;
        int i=0, j=0;
        while(i<s1 && j<s2){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int []ans=new int[list.size()];
        for(i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
