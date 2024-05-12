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
    public boolean isCousins(TreeNode root, int x, int y) {
        int h1,h2;
        h1 = height(root, x, 0);
        h2 = height(root, y, 0);

        if(h1==h2 && !isSibling(root, x, y))
        return true;
        return false;

    }
    static int height(TreeNode node, int k, int h){
        if(node==null) return -1;
       
        if(node.val == k) return h;
        
        int a = height(node.left, k, h+1);
        int b = height(node.right, k, h+1);
        return Math.max(a,b);
    }
    static boolean isSibling(TreeNode node, int x, int y) {
        if (node == null) return false;
        
        boolean sp = false;
        if (node.left != null && node.right != null) {
            sp = (node.left.val == x && node.right.val == y) || (node.left.val == y && node.right.val == x);
        }
        
        return sp || isSibling(node.left, x, y) || isSibling(node.right, x, y);
    }
}
