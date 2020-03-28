/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

import java.util.ArrayList;

// to implement BinarySearchTree
public class MyBinarySearchTree {

    TreeNode root;

    TreeNode newnode = new TreeNode();

    public MyBinarySearchTree() {
        root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    //  Method to insert data in BST
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

    int leftNodeCount = 0;
    int noLeftNodeCount = 0;

    ArrayList<Integer> leftNode = new ArrayList<>();

    //  Method for traversing in BST for req result
    public void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        } else {
            inOrderTraversal(node.getLeft());
            if (node.getLeft() != null) {
                leftNodeCount++;
                leftNode.add(node.getLeft().getData());
            } else if (node.getLeft() == null || node.getRight() != null) {
                noLeftNodeCount++;
            }
            System.out.print(node.getData() + " ");
            inOrderTraversal(node.getRight());
        }
    }

    //  Method to print all the results obtained
    public void printNode() {
        System.out.println();
        for (Integer integer : leftNode) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println("Nodes who are not having Left child :" + noLeftNodeCount);
    }
}
