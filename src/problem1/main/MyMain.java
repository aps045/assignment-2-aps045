/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree binarySearchTree = new MyBinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the No of Elements that is to be entered for formation of BST : ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the Value : ");
            int val = scanner.nextInt();
            binarySearchTree.insert(val);
        }
        System.out.println("\n...............INORDER TRAVERSAL................");
        binarySearchTree.inOrderTraversal(binarySearchTree.getRoot());
        binarySearchTree.printNode();
    }
}
