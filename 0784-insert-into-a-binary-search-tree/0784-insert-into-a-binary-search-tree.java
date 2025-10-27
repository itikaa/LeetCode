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
     
    public TreeNode insertIntoBST(TreeNode root, int val) {
           TreeNode x=new TreeNode(val);
           if(root==null){return x;}
           insert(root,x);
           return root;
        
    }
    public void insert(TreeNode root,TreeNode n){
        if(n.val>root.val){
            if(root.right!=null){
             insert(root.right,n); 
            }
            else{
            root.right=n;}
             }
        else{ 
            if(root.left!=null){insert(root.left,n); }
            else{ root.left=n;}
        }
    }
}