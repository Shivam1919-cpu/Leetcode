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
    // static int idx = -1;
    public TreeNode sortedArrayToBST(int[] nums) {
        return distribute(nums, 0,nums.length -1 );
    }
    private TreeNode distribute ( int[] nums, int left , int right){
        if(left > right){
            return null; 
        }

        int midIndex = (left + right)/2;
        TreeNode node = new TreeNode(nums[midIndex]);

        node.left = distribute ( nums,left,midIndex - 1);
        node.right = distribute ( nums,midIndex + 1,right);
        return node;



    }
}