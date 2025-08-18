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
    List<Integer> res=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        //dfs(root,0);
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode rightside=null;
            int qLen=q.size();
            for(int i=0;i<qLen;i++){
                TreeNode node=q.poll();
                if(node!=null){
                    rightside=node;
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if(rightside!=null){
                res.add(rightside.val);
            }
        }
        return res;
    }
    /*
    public void dfs(TreeNode root,int depth){
        if(root==null)return;
        if(res.size() == depth){
            res.add(root.val);
        }
        dfs(root.right,depth+1);
        dfs(root.left,depth+1);
    }
    */
}