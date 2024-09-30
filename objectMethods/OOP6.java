package objectMethods;

import java.util.Arrays;

public class OOP6 {
    public static void main(String[] args) {
        Student s1 = new Student(22, 30);
        Student s2 = new Student(20, 12);
        Student s3 = new Student(20, 14);
        Student s4 = new Student(20, 19);
        Student s5 = new Student(20, 21);
        Student[] arr = {s1, s2, s3, s4, s5};
        Arrays.sort(arr, (o1, o2) -> -(int) (o1.marks - o2.marks));
        System.out.println(Arrays.toString(arr));
    }
}
