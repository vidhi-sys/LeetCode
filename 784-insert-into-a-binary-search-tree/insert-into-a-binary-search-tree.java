class Solution {

    public void attach(TreeNode root, int key) {
        if (root.val < key) {

            if (root.right == null) {
                root.right = new TreeNode(key);
                return;
            }

            attach(root.right, key);

        } else {

            if (root.left == null) {
                root.left = new TreeNode(key);
                return;
            }

            attach(root.left, key);
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }

        attach(root, val);

        return root;
    }
}