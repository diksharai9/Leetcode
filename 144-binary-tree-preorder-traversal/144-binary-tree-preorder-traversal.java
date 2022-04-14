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
     ArrayList<Integer>list=new ArrayList();
    public List<Integer> preorderTraversal(TreeNode root) {
       
         if (root == null){
              return new ArrayList<>();
         }
else{
  // Traverse root
  list.add(root.val);
  // Traverse left
  preorderTraversal(root.left);
  // Traverse right
  preorderTraversal(root.right);
}
        return list;
    }
}