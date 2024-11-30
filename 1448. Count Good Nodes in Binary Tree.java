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
    int cnt;
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;

        helper(root, root.val);
        return cnt;
    }
    public void helper(TreeNode root, int max){
        if(root == null) return;

        if(root.val >= max){
            cnt++;
            max=root.val;
        }
        helper(root.left, max);
        helper(root.right, max);
    }
}
