class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode helper(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        // Base case: if boundaries cross, the subtree is empty
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }

        // 1. The last element of the current postorder segment is the root
        int rootVal = postorder[postEnd];
        TreeNode root = new TreeNode(rootVal);

        // 2. Find the index of the root value in the inorder array (O(N) operation)
        int idx = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                idx = i;
                break;
            }
        }

        // Calculate the number of nodes in the right subtree
        int rightSubtreeSize = inEnd - idx;

        // 3. Recursively build subtrees by calculating exact segment boundaries
        // Right subtree in postorder spans right before the root node
        root.right = helper(inorder, idx + 1, inEnd, 
                            postorder, postEnd - rightSubtreeSize, postEnd - 1);
        
        // Left subtree in postorder spans everything before the right subtree segment
        root.left = helper(inorder, inStart, idx - 1, 
                           postorder, postStart, postEnd - rightSubtreeSize - 1);

        return root;
    }
}
