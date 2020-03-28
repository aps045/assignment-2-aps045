/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    Node newnode = new Node();

    public void insert(Student s) {
        Node node = new Node(s);
        if (node.getData().getAppearingCount() > 2 || node.getData().getAppearingCount() < 0
        || node.getData().getBacklogCount() < 0) {
            System.out.println("\nData is not Valid !!!\n");
        } else {
            if (newnode.getFront() == null) {
                newnode.setFront(node);
                newnode.setRear(node);
            } else {
                newnode.getRear().setNext(node);
                node.setNext(newnode.getFront());
                newnode.setRear(node);
            }
            System.out.println("\nData is Valid, hence inserted\n");
        }
    }

    public void deleteNode(int val) {
        newnode.setCurrent(newnode.getRear());
        if (newnode.getFront() == null) {
            System.out.println("\nQueue is Empty!!!\n");
        } else if (newnode.getCurrent() == newnode.getRear() && newnode.getCurrent() == newnode.getFront()
                && newnode.getCurrent().getData().getBacklogCount() == 0) {
            System.out.println("\nDeleted Data -------");
            System.out.println(newnode.getCurrent().getData().toStrings());
            newnode.setFront(null);
            newnode.setRear(null);
        } else {
            while(true) {
                if (newnode.getCurrent().getNext().getData().getBacklogCount() == 0) {
                    if (newnode.getCurrent().getNext() == newnode.getFront()) {
                        System.out.println("\nDeleted Data -------");
                        System.out.println(newnode.getFront().getData().toStrings());
                        newnode.setFront(newnode.getFront().getNext());
                        newnode.getRear().setNext(newnode.getFront());
                        break;
                    } else if (newnode.getCurrent().getNext() == newnode.getRear()) {
                        System.out.println("\nDeleted Data -------");
                        System.out.println(newnode.getRear().getData().toStrings());
                        newnode.getCurrent().setNext(newnode.getFront());
                        newnode.setRear(newnode.getCurrent());
                        break;
                    } else {
                        System.out.println("\nDeleted Data -------");
                        System.out.println(newnode.getCurrent().getNext().getData().toStrings());
                        newnode.setCurrent(newnode.getCurrent().getNext().getNext());
                        break;
                    }
                }
                newnode.setCurrent(newnode.getCurrent().getNext());
            }
        }
    }

    public void display() {
        if (newnode.getFront() == null) {
            System.out.println("\nQueue is Empty!!!\n");
        } else {
            newnode.setCurrent(newnode.getRear());
            while (newnode.getCurrent().getNext() != newnode.getRear())  {
                if (newnode.getCurrent().getData().getBacklogCount() - newnode.getCurrent().getData().getAppearingCount() == 1) {
                    System.out.print(newnode.getCurrent().getData().toStrings());
                    System.out.println();
                }
                newnode.setCurrent(newnode.getCurrent().getNext());
            }
        }
    }

    public void printAll() {
        if (newnode.getFront() == null) {
            System.out.println("\nQueue is Empty!!!\n");
        } else {
            newnode.setCurrent(newnode.getRear());
            while (newnode.getCurrent().getNext() != newnode.getRear())  {
                System.out.print(newnode.getCurrent().getData().toStrings());
                System.out.println();
                newnode.setCurrent(newnode.getCurrent().getNext());
            }
        }
    }
}
