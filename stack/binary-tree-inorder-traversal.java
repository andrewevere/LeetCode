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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new LinkedList<>();
        inorderTraversal(root,output);
        return output;
    }

    private void inorderTraversal(TreeNode root, List<Integer> output){
        if (root == null){
            return;
        }

        inorderTraversal(root.left, output);

        output.add(root.val);

        inorderTraversal(root.right, output);
    }
}