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
    
      public class Pair{
        TreeNode node;
        int size;
        Pair(TreeNode node,int s){
            if(node!= null)
                this.node= node;
            this.size= s;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0 ;
        
        Queue<Pair> q = new ArrayDeque<>();
        
        q.add(new Pair(root,1));
        int maxWidth = 0 ;
        
        while(q.size() > 0 ){
            int size = q.size() ;
            int count = 1 ;
            int first = 0 , last = 0 ;
            
            while(size-- >  0){
                Pair curr = q.remove();
                if(curr.node != null){
                    q.add(new Pair(curr.node.left,curr.size * 2));
                    q.add(new Pair(curr.node.right,curr.size * 2 + 1));
                    
                      if(first==0){
                        first= curr.size;
                        last= curr.size;
                    }else{
                        last= curr.size;
                    }
                }
                count++ ;
            }
            maxWidth= Math.max(last-first+1, maxWidth); 
            
        }
        return maxWidth ;
    }
}