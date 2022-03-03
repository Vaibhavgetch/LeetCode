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
    public void flatten(TreeNode root) {
      
        /*
         // Using Recurssion
        if(root == null) return ;
       
        flatten(root.left);
        flatten(root.right);
        
        if(root.left != null){
            TreeNode rootkRight = root.right ;
            root.right = root.left ;
            root.left = null ;
            while(root.right != null)
                root = root.right ;
                root.right = rootkRight ;
            
        }
        
        */
        
        /*Morris Traversal*/
        if(root == null) return ;
            
        TreeNode curr = root ;
        while(curr != null){
            if(curr.left != null){
                TreeNode temp = curr.left ;
                while(temp.right != null){
                    temp = temp.right ; 
                }
                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right ;
        }
        
    }
}