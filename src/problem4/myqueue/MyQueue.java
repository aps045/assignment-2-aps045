/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.node.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    Queue<String> queue = new LinkedList<>();
    ArrayList<Integer> preOrderLinkedList = new ArrayList<>();
    ArrayList<Integer> postOrderLinkedList = new ArrayList<>();

    //  Method to traverse tree through pre order traversing
    public void preOrder(TreeNode x) {
        if (x == null) {
            return;
        } else {
            preOrderLinkedList.add(x.getData());
            preOrder(x.getLeft());
            preOrder(x.getRight());
        }
    }

    //  Method to traverse tree through post order traversing
    public void postOrder(TreeNode x) {
        if (x == null) {
            return;
        } else {
            postOrder(x.getLeft());
            postOrder(x.getRight());
            postOrderLinkedList.add(x.getData());
        }
    }

    //  Method to print pre - order successor of all the nodes of given binary search tree stored in a queue
    public void printSuccessor() {
        for (int i = 0; i < preOrderLinkedList.size() - 1; i++) {
            queue.add(preOrderLinkedList.get(i) + " successor is-------> " + preOrderLinkedList.get(i + 1));
        }
        queue.add(preOrderLinkedList.get(preOrderLinkedList.size() - 1) + " successor is-------> " + "null");
    }

    //  Method to print the tree through pre order approach
    public void printPreOrder() {
        System.out.println("--------------------PREORDER---------------------");
        for (int i = 0; i < preOrderLinkedList.size(); i++) {
            System.out.print(preOrderLinkedList.get(i) + " ");
        }
        System.out.println();
    }

    //  Method to print the tree through post order approach
    public void printPostOrder() {
        System.out.println("--------------------POSTORDER---------------------");
        for (int i = 0; i < postOrderLinkedList.size(); i++) {
            System.out.print(postOrderLinkedList.get(i) + " ");
        }
        System.out.println();
    }

    /*
    * Method to check where the root element is present
    * in both pre order and post order at extreme end
     */
    public void checkOpposites() {
        if (preOrderLinkedList.get(0) == postOrderLinkedList.get(postOrderLinkedList.size() - 1)) {
            System.out.println("STATEMENT 1 PROVED CORRECT");
        } else {
            System.out.println("SORRY!!! STATEMENT 1 PROVED WRONG");
        }
    }

    /*
    * Method to check whether mid element in case
    * of both approach for a tree is same or not
     */
    public void checkMiddles(int mid) {
        if (postOrderLinkedList.get(mid) == preOrderLinkedList.get(mid)) {
            System.out.println("STATEMENT 2 PROVED CORRECT");
        } else {
            System.out.println("SORRY!!! STATEMENT 2 PROVED WRONG");
        }
    }

    //  Method to display pre - successor of each node of given BST
    public void display() {
        for (String i : queue) {
            System.out.println(i);
        }
    }
}
