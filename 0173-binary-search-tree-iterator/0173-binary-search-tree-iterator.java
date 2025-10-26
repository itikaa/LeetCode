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
class BSTIterator {
    List<Integer> list=new ArrayList<>();
    Stack<TreeNode> st=new Stack<>();
     int i=0;
    public BSTIterator(TreeNode root) {
           while(root!=null || !st.isEmpty()){
            while(root!=null){
                st.push(root);
                root=root.left;
            }
            root=st.pop();
            list.add(root.val);
            root=root.right;
           }
    }
    
    public int next() {
        return list.get(i++);
    }
    
    public boolean hasNext() {
        if(i<list.size()){return true;}
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */