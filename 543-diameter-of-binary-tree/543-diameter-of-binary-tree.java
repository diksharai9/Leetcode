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
   private int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        calDiameter(root);
        return diameter;
    }
    
    private int calDiameter(TreeNode root) {
        int leftD = 0;
        if(root.left != null)
            leftD = calDiameter(root.left) + 1;
        
        int rightD = 0;
        if(root.right != null)
            rightD = calDiameter(root.right) + 1;
        
        diameter = Math.max(diameter, leftD + rightD);
        
        return Math.max(leftD, rightD);
    }
}