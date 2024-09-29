package OOPproperties;

import accessControl.A;

public class OOP3 extends A{
    public OOP3() {
        super();
    }

    public OOP3(int number) {
        super(number);
    }

    public static void main(String[] args) {
        boxWeight b1 = new boxWeight();
        //b1 can only access values and methods which are part of box class;
//        b1.display();

        shapes s1 = new circle();
        //if both shapes and circle class contains method display, circle's will be called
        //else shapes' s will be called
        s1.display();
        OOP3 obj = new OOP3(22);
        System.out.println(obj.str);
        System.out.println(obj.number);

    }
}
