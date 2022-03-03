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
    
    // Using Morris Traversal
    // TC = O(N)
    // SC = O(1)s
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>() ;
        
        while(root != null){
            if(root.left != null){
                TreeNode rootKLeft = root.left ;
                while(rootKLeft.right != null && rootKLeft.right != root ){
                    rootKLeft =  rootKLeft.right ;
                }
                
                //if threaded
                if(rootKLeft.right == root){
                    ans.add(root.val);
                    rootKLeft.right = null ;
                    root = root.right ;
                }
                else{
                    rootKLeft.right = root ;
                    root = root.left ;
                }
            }
            else{
                ans.add(root.val);
                root = root.right ;
            }
        }
        return ans ;
    }
}