package objectMethods;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    int roll;
    int marks;

    public Student(int roll, int marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return this.marks + " ";
    }

    @Override
    public int compareTo(Student o) {
        return this.marks - o.marks;
    }
}
class comp implements Comparator<Integer>{
//this is what we use in HashMap and priority queues to compare two key value pairs;
    @Override
    public int compare(Integer o1, Integer o2) {
        return 0;
    }
}