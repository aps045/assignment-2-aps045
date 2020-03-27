/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    private int roll;
    private String name;
    private int backlogCount;
    private int appearingCount;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public Student(int roll, String name, int backlogCount, int appearingCount) {
        this.roll = roll;
        this.name = name;
        this.backlogCount = backlogCount;
        this.appearingCount = appearingCount;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBacklogCount() {
        return backlogCount;
    }

    public void setBacklogCount(int backlogCount) {
        this.backlogCount = backlogCount;
    }

    public int getAppearingCount() {
        return appearingCount;
    }

    public void setAppearingCount(int appearingCount) {
        this.appearingCount = appearingCount;
    }

    @Override
    public String toString() {
        return "\n\tRoll No. : " + getRoll()
                + "\n\tName : " + getName();
    }
}
