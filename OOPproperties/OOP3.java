package OOPproperties;

public class OOP3 {
    public static void main(String[] args) {
        boxWeight b1 = new boxWeight();
        //b1 can only access values and methods which are part of box class;
//        b1.display();

        shapes s1 = new circle();
        //if both shapes and circle class contains method display, circle's will be called
        //else shapes' s will be called
        s1.display();
    }
}
