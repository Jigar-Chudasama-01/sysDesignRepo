public class OOP1 {
    public static void main(String[] args) {
        //s1 is a reference to object;
        Student s1 = new Student();
        Student s2 = s1;
        //compile time      run time;
        System.out.println(s1);
        System.out.println(s2);
    }
}

class Student {//capitalize first letter of class;
    //instance variables
    String name;
    int roll_no;
    int[] marks;

    Student() {
        //call constructor with 3 params;
        this("Jigar", 22, new int[]{1, 2, 3});
    }

    Student(Student clone) {
        //copy constructor;
        this.name = clone.name;
        this.roll_no = clone.roll_no;
        this.marks = clone.marks;
    }

    //constructor is what gives values to obj properties when obj is created;
    Student(String name, int roll_no, int[] arr) {
        //(this) is replaced with object reference;
        this.name = name;
        this.roll_no = roll_no;
        this.marks = arr;
    }
    @Override
    public String toString() {
        return "Object is Empty !";
    }
}
