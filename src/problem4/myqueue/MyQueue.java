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
    ArrayList<Integer> linkedList = new ArrayList<>();

    public void preorder(TreeNode x) {
        if (x == null) {
            return;
        } else {
            linkedList.add(x.getData());
            preorder(x.getLeft());
            preorder(x.getRight());
        }
    }

    public void printSuccessor() {
        for (int i = 0; i < linkedList.size() - 1; i++) {
            queue.add(linkedList.get(i) + " successor is-------> " + linkedList.get(i + 1));
        }
        queue.add(linkedList.get(linkedList.size() - 1) + " successor is-------> " + "null");
    }

    public void display() {
        for (String i : queue) {
            System.out.println(i);
        }
    }
}
