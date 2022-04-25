/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
   
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode lef,righ;
        if(root==null)
            return null;
        else if(root.val==p.val || root.val==q.val)
            return root;
        lef=lowestCommonAncestor(root.left,p,q);
        righ=lowestCommonAncestor(root.right,p,q);
        if(lef==null)return righ;
        if(righ==null)return lef;
        return root;
        
        
        
    }
}