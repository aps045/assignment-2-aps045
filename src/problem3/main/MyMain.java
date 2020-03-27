/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

import java.util.Scanner;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyPriorityQueue obj = new MyPriorityQueue();
        int choice = 0;
        while (choice != 5) {
            System.out.print("Here is Queue Implementation using Linked List according to Roll No in ascending order-----\n"
                    + "1. Enter the Data of Student\n"
                    + "2. Delete the Data of Student\n"
                    + "3. Print the data of a Student\n"
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
                    System.out.print("Course : ");
                    String course = scanner.nextLine();
                    System.out.print("Branch : ");
                    String branch = scanner.nextLine();
                    System.out.print("Year : ");
                    int year = scanner.nextInt();
                    Student student = new Student(roll, name, course, branch, year);
                    obj.insertData(student);
                    System.out.println("\nData is Inserted !!!\n");
                    break;

                case 2 :
                    obj.deleteData(1);
                    break;

                case 3 :
                    System.out.print("Enter the Roll No of Student whose data you want to see : ");
                    int rn = scanner.nextInt();
                    obj.printQueue(rn);
                    break;

                case 4 :
                    obj.printAll();
                    break;

                case 5 :
                    System.out.println("\nThank You !!!"
                            + "\nThe Data Entry Queue will be deleted.");
                    obj.deleteData(0);
                    break;

                default :
                    System.out.println("Please Enter a valid Input !!!");
            }
        }
    }
}
