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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        
        if (root == null) return list;
        
        // Find height of the tree.
        int h = height(root);
        
        // Go through each level and add nodes to the result list.
        for (int level = 1; level <= h; level++) {
            list.add(addNodesInCurrentLevel(root, level));
        }
        
        return list;
    }
    
    // Add all nodes in current level to the list.
    private List<Integer> addNodesInCurrentLevel(TreeNode root, int level) {
        List<Integer> list = new ArrayList<>();
        
        if (root == null) return list;
        
        if (level == 1) list.add(root.val);
        else {
            list.addAll(addNodesInCurrentLevel(root.left, level - 1));
            list.addAll(addNodesInCurrentLevel(root.right, level - 1));
        }
        
        return list;
    }
    
    // Find height or the tree.
    private int height(TreeNode root) {
        if (root == null) return 0;
        
        int left = height(root.left);
        int right = height(root.right);
        
        if (left > right) {
            return left + 1;
        } else {
            return right + 1;
        }
    }
}
