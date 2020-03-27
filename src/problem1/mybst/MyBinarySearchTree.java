/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {

    int count;
    TreeNode root;

    TreeNode newnode = new TreeNode();

    public MyBinarySearchTree() {
        root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void insert(int value) {
        TreeNode ele = new TreeNode(value);
        /*
         * Condition to check whether root is null or not
         * if YES then assign the newNode to root
         * else go further
         */
        if (root == null) {
            root = ele;
        } else {
            newnode.setCurrent(root);
            newnode.setParent(null);
            while (true) {
                newnode.setParent(newnode.getCurrent());
                /*
                 * Condition to check whether the given value is small then current value or not
                 */
                if (ele.getData() <= newnode.getCurrent().getData()) {
                    newnode.setCurrent(newnode.getCurrent().getLeft());
                    if (newnode.getCurrent() == null) {
                        newnode.getParent().setLeft(ele);
                        return;
                    }
                } else {
                    newnode.setCurrent(newnode.getCurrent().getRight());
                    if (newnode.getCurrent() == null) {
                        newnode.getParent().setRight(ele);
                        return;
                    }
                }                           //  End of else
            }                               //  End of while Loop
        }                                   //  End of else
    }


//    public void traverse() {
//        newnode.setCurrent(root);
//        newnode.setParent(root);
//        this.count = 0;
//        while (newnode.getCurrent() != null) {
//            newNode.setParent(newNode.getCurrent());
//            if (newNode.getCurrent().getLeft() == null) {
//                count++;
//            }
//            if (newNode.getParent().getData() == newNode.getCurrent().getData()){
//
//            }
//            if (newNode.getParent().getData() < newNode.getCurrent().getData()) {
//                System.out.println(newNode.getCurrent().getData());
//                newNode.setCurrent(newNode.getCurrent().getLeft());
//            }
//            if (newNode.getParent().getData() > newNode.getCurrent().getData()) {
//                newNode.setCurrent(newNode.getCurrent().getRight());
//            }
//            if (newnode.getCurrent().getLeft() == null) {
//                count++;
//                newnode.setCurrent(newnode.getParent().getRight());
//            } else {
//                newnode.setCurrent(newnode.getCurrent().getLeft());
//                if (newnode.getParent().getRight().getRight() != null) {
//                    newnode.setParent(newnode.getCurrent());
//                }
//                System.out.println(newnode.getCurrent().getData());
//
//            }
//        }
//    }
}
