/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
 
 
    public int minDepth(TreeNode root) {
       int ans;
      if(root ==null)
      return 0;
      
        //   int l=minDepth(root.left);
        //   int r=minDepth(root.right);
        //    ans= Math.min(l,r)+1;
        //   if(ans==1)
        //   {
        //     ans= Math.max(l,r)+1;
        //   }
        //   return ans;
        if(root.left!=null && root.right!=null){
            int l=minDepth(root.left);
            int r=minDepth(root.right);
            return Math.min(l,r)+1;
        }
        if(root.left==null){
            int k=minDepth(root.right);
            return k+1;
        }
        if(root.right==null){
            int m=minDepth(root.left);
            return m+1;
        }
        return 0;
      }  

}
