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
    private String course;
    private String branch;
    private int year;

    public Student() {
        roll = 0;
        name = "";
        course = "";
        branch = "";
        year = 0;
    }

    public Student(int roll, String name, String course, String branch, int year) {
        this.roll = roll;
        this.name = name;
        this.course = course;
        this.branch = branch;
        this.year = year;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
