/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;
    private TreeNode current;
    private TreeNode parent;

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode() {
        data = 0;
        left = null;
        right = null;
        current = null;
        parent = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getCurrent() {
        return current;
    }

    public void setCurrent(TreeNode current) {
        this.current = current;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
}
