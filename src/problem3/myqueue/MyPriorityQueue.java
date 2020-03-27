/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;
import problem5.student.Student;

//  To perform all the operations of PriorityQueue
public class MyPriorityQueue {
    Node front;                     //  A variable which points first node of a Queue

    public MyPriorityQueue() {
        front = null;
    }

    /*
    *   Method to insert Student type Data in Queue
    *   Data is in Ascending Order of roll no. that's why Priority Queue concept is used
     */
    public void insertData(Student s) {
        Node node = new Node(s);
        if (front == null || front.getData().getRoll() > node.getData().getRoll()) {
            node.setNext(front);
            front = node;
        } else {
            Node temp = front;
            while(temp.getNext() != null && temp.getNext().getData().getRoll() <= node.getData().getRoll()) {
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
    }

    /*
    *   Method for deleting the data from Queue
    *   Every time first node is deleted whenever this method is being called according to FIFO concept
     */
    public void deleteData(int clr) {
        if (clr == 0) {
            front = null;
        } else {

            //  Condition to check whether Queue is empty or not
            if (front == null) {
                System.out.println("\nData Entry Queue is Empty\n");
            } else {
                System.out.println("Data of Student that will be Deleting ----\n"
                        + "Roll No. : " + front.getData().getRoll()
                        + "\nName : " + front.getData().getName()
                        + "\nCourse : " + front.getData().getCourse()
                        + "\nBranch : " + front.getData().getBranch()
                        + "\nYear : " + front.getData().getYear() + "\n");
                if (front.getNext() == null) {
                    front = null;
                } else {
                    front = front.getNext();
                }
            }
        }
    }

    /*
    *   Method to print data associated with the roll no of Student entered by User
     */
    public void printQueue(int roll) {

        //  Condition to check whether Queue is empty or not
        if (front == null) {
            System.out.println("\nData Entry Queue is Empty\n");
        } else {
            Node temp = front;
            while (temp != null && temp.getData().getRoll() != roll) {
                temp = temp.getNext();
            }

            /*
            *  Condition to check whether the node containing the data associated with
            *  roll no of Student is present or not in the Queue
             */
            if (temp == null) {
                System.out.println("\nStudent with Roll No " + roll + " is not found !!!\n");
            } else {
                System.out.println("Details of Student are ------"
                        + "\nRoll No. : " + temp.getData().getRoll()
                        + "\nName : " + temp.getData().getName()
                        + "\nCourse : " + temp.getData().getCourse()
                        + "\nBranch : " + temp.getData().getBranch()
                        + "\nYear : " + temp.getData().getYear() +"\n");
            }
        }
    }

    public void printAll() {

        //  Condition to check whether Queue is empty or not
        if (front == null) {
            System.out.println("\nData Entry Queue is Empty\n");
        } else {
            Node temp = front;
            int i = 1;
            System.out.println();
            while (temp != null) {
                System.out.println("Details of Student " + i + " are ------"
                        + "\nRoll No. : " + temp.getData().getRoll()
                        + "\nName : " + temp.getData().getName()
                        + "\nCourse : " + temp.getData().getCourse()
                        + "\nBranch : " + temp.getData().getBranch()
                        + "\nYear : " + temp.getData().getYear() +"\n");
                temp = temp.getNext();
                i++;
            }
        }
    }
}
