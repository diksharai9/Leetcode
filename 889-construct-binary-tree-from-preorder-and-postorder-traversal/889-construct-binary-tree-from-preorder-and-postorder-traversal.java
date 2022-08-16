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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        
        int ps = 0, pe=preorder.length-1;
        int pos = 0, poe= postorder.length-1;
        
        return constructTree(preorder,ps,pe,postorder,pos,poe);
    }
    
    public TreeNode constructTree(int[] preorder, int ps, int pe, int[] postorder, int pos,int poe){
        
        if(ps > pe) return null;
        
        TreeNode root = new TreeNode(preorder[ps]);
        
        if(ps - pe == 0) return root;
        
        int index = -1;
        for(int i=poe-1; i >= pos; i--){
            if(postorder[i] == preorder[ps+1]){
                index = i;
                break;
            }
        }
        
        int count = index - pos + 1;
        
        root.left = constructTree(preorder, ps+1,ps+count, postorder, pos, index );
        root.right = constructTree(preorder, ps+count + 1, pe, postorder,index+1, poe-1);
        
        return root;
        
    }
}