/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        MyQueue myQueue = new MyQueue();
        System.out.print("Enter the no of Elements to enter in the Tree : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the value to be entered : ");
            int value = scanner.nextInt();
            obj.insert(value);
        }
        myQueue.preorder(obj.getRoot());
        myQueue.printSuccessor();
        myQueue.display();
    }
}
