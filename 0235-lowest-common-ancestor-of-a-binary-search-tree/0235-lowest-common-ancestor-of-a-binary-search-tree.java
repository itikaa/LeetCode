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
     TreeNode LCA;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
     commonAncestor(root,p,q);
      return LCA;

    }

    public void commonAncestor(TreeNode root,TreeNode p,TreeNode q){
            int P=p.val; int Q=q.val;
            if( (root.val>P && root.val<Q) || (root.val<P && root.val>Q) )
            { LCA=root;return ;}
              if(root.val==P || root.val==Q){ LCA=root;return;}
              if(root.val>P && root.val>Q ){commonAncestor(root.left,p,q);}
              if(root.val<P && root.val<Q ){commonAncestor(root.right,p,q);}
              return;
    }

}