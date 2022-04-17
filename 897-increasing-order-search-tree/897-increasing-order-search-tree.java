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
     public void inOrder(TreeNode root, List<Integer> list){
        if(root == null)
        return;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
        
    }
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> val = new ArrayList<>() ;
        
        inOrder(root,val);
        TreeNode ans = new TreeNode();
        TreeNode curr = ans ;
        for(int v: val){
            curr.right = new TreeNode(v);
            curr = curr.right ;
        }
        return ans.right ;
    }
    
}