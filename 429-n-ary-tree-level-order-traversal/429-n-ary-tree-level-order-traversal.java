/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
         List<List<Integer>> res = new ArrayList<>();
        
        if(root == null) return res;
            
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            
            int size = q.size(); // no. of nodes at current level
            List<Integer> curLvl = new ArrayList<>(); // list of current level node values
            
            while(size-- > 0){ 
                Node cur = q.poll();
                curLvl.add(cur.val);
                
                for(Node child: cur.children){ // add current node's child into queue
                    q.add(child);
                }
            }
            
            res.add(new ArrayList<>(curLvl));
        }
        return res;
       
    }
}