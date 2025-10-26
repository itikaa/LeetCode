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
    public  int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){return 0;}
        if(root.left==null && root.right==null){return 0;}
        sum(root.left,0);
        sum(root.right,1);
        return sum;
    }
    public void sum(TreeNode root,int r){
          if(root==null){return ;}
          if(root.left==null && root.right==null && r==0 ){sum+=root.val;}
          sum(root.left,0);
          sum(root.right,1);
    }
}