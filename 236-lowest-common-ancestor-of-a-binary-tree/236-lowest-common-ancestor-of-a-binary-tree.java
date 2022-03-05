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
    // We are returning the node whose left and right are not null
    // That means at the LCA we will have some not null values from both sides
    //In case if LCA is either p or q, it will return the first encounter
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            
        if(root == null) return null ;
        
        if(root == p || root == q) return root ;
        
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        
        if(left != null && right != null){
            return root ;
        }
        
        return left == null? right : left ;
    }
}