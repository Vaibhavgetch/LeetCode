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
    static class Pair{
        int withRobbery = 0;
        int withoutRobbery = 0;
        }
    
    public Pair helper(TreeNode root){
        
        if(root == null) return new Pair() ;
        
        Pair left = helper(root.left);
        Pair right = helper(root.right);
        
        Pair ans = new Pair() ;
        ans.withRobbery = root.val + left.withoutRobbery + right.withoutRobbery ;
        ans.withoutRobbery = Math.max(left.withRobbery, left.withoutRobbery) + Math.max(right.withRobbery, right.withoutRobbery) ;
        
        return ans ;
        
    }
    public int rob(TreeNode root) {
        Pair ans = helper(root);
        return Math.max(ans.withRobbery, ans.withoutRobbery);
    }
}