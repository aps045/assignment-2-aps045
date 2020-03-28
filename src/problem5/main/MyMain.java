/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.Scanner;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.print("Here is Implementation of a circular queue to process "
                    + "the given list of students  as per the following conditions:\n" +
                    "i. Element will be removed from the queue if its backLog counter value is equal to zero.\n" +
                    "ii. You can only process the front element, processing means 'backLog - appearingCount'\n" +
                    "iii. For any element appearing count will not be greater than 2.\n"
                    + "1. Enter the Data of Student\n"
                    + "2. Deletion\n"
                    + "3. Printing the valid data according to point ii.\n"
                    + "4. Print whole Queue\n"
                    + "5. Exit\n"
                    + "Please enter your choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 :
                    System.out.println("\nPlease Enter the following details -------");
                    System.out.print("Roll No : ");
                    int roll = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Name : ");
                    String name = scanner.nextLine();
                    System.out.print("No. of Backlogs : ");
                    int backlogCount = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Appearing Count : ");
                    int appearingCount = scanner.nextInt();
                    scanner.nextLine();
                    Student student = new Student(roll, name, backlogCount, appearingCount);
                    obj.insert(student);
                    break;

                case 2 :
                    obj.deleteNode(1);
                    break;

                case 3 :
                    obj.display();
                    break;

                case 4 :
                    obj.printAll();
                    break;

                case 5 :
                    System.out.println("\nThank You !!!"
                            + "\nThe Circular Queue will be deleted.");
                    obj.deleteNode(0);
                    break;

                default :
                    System.out.println("\nPlease Enter a valid Input !!!\n");
            }
        }
    }
}
