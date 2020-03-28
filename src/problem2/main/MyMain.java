/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyQueue myQueue = new MyQueue();
        MyBinarySearchTree obj = new MyBinarySearchTree();
        System.out.print("Enter the No of Elements that you want to enter in the tree : ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Value to be inserted in the tree : ");
            int value = scanner.nextInt();
            obj.insert(value);
        }
        int middle = size / 2;
        myQueue.postOrder(obj.getRoot());
        myQueue.preOrder(obj.getRoot());
        System.out.println();
        myQueue.printPreOrder();
        System.out.println();
        myQueue.printPostOrder();
        System.out.println();
        myQueue.checkOpposites();
        myQueue.checkMiddles(middle);
    }
}
