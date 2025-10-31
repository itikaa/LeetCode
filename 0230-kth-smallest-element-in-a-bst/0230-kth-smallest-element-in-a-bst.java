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
    int ans=0; int count;
    public int kthSmallest(TreeNode root, int k) {
        count=k;
         order(root);
         return ans;
        }
      
      public void order(TreeNode root){
         if(root==null){return ;}
         order(root.left);
        count--;
        if(count==0){ans=root.val; return; }
        order(root.right);
      }
    
}