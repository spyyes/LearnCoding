package ConstructBinaryTree;

import java.util.HashMap;

/**
 * a brief introduction
 *
 * @author spy@pku.edu.cn
 */
public class Solution {

    HashMap<Integer, Integer> rootBook = new HashMap<>();
    int[] preorder, inorder;

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n) + O(h) + O(n) = O(n)
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        if (preorder.length != inorder.length) {
            //Error Handling.
            return null;
        }
        if (preorder.length == 0) {
            return null;
        }

        for (int i = 0; i < inorder.length; i++) {
            rootBook.put(inorder[i], i);
        }
        return constructTree(0, preorder.length - 1, 0, preorder.length - 1);

    }

    public TreeNode constructTree(int pre_start, int pre_end, int in_start, int in_end) {
        if (pre_start > pre_end) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[pre_start]);
        int rootIdx = rootBook.get(root.val);
        int leftTreeSize = rootIdx - in_start;
        root.left = constructTree(pre_start + 1, pre_start + leftTreeSize, in_start, rootIdx - 1);
        root.right = constructTree(pre_start + leftTreeSize + 1, pre_end, rootIdx + 1, in_end);
        return root;

    }
}
